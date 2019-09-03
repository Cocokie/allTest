package com.lix.transit;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.neo4j.driver.v1.*;
import org.neo4j.driver.v1.types.Node;
import org.neo4j.driver.v1.types.Relationship;

import java.util.*;

public class NeoTask implements Runnable {
    public static final ObjectMapper om = new ObjectMapper();
    private NeoContext neoContext;
    Neo4jUtils Neo4jUtils = new Neo4jUtils();

    public NeoTask(NeoContext neoContext) {
        this.neoContext = neoContext;
    }


    public void run() {
        //Neo4jUtils.getSession2();
        while (true) {
            try (Session session = Neo4jUtils.getSession2()) {
                String getcql = getCqlFirQuery();
                if (getcql.equals("over")) {
                    return;
                    //break;
                }
                System.out.println(getcql);
                StatementResult result = session.run(getcql);
                Neo4jUtils.closeSession(session);
                while (result.hasNext()) {
                    Record record = result.next();
                    Map<String, Object> stringObjectMap = record.asMap();
                    Node from = (Node) stringObjectMap.get("from");
                    Relationship r = (Relationship) stringObjectMap.get("r");
                    Node to = (Node) stringObjectMap.get("to");
                    HashMap<String, Node> nodeMap = new HashMap();
                    nodeMap.put("fromNode", from);
                    nodeMap.put("toNode", to);
                    toGraphSecDb(r, nodeMap);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("当前线程：" + Thread.currentThread().getName() + " 出现问题查询   " + e.getMessage());
                break;
            }
        }
        System.out.println("当前线程：" + Thread.currentThread().getName() + " 结束  " + neoContext.getCurrentRelationNum());
    }

    private void toGraphSecDb(Relationship r, Map nodeMap) {
        List<String> cqlSecInsertNode = getCqlSecInsertNode(nodeMap);
        String cqlSecInsertRelation = getCqlSecInsertRelation(r);
        try (Session session = Neo4jUtils.getSession2()) {
            Transaction transaction = session.beginTransaction();
            for (String cql : cqlSecInsertNode) {
                transaction.run(cql);
            }
            transaction.run(cqlSecInsertRelation);
            neoContext.setCurrentRelationNum(neoContext.getCurrentRelationNum() + 1);
            System.out.println(Thread.currentThread().getName() + " 当前处理任务条数   " + neoContext.getCurrentRelationNum());
            transaction.success();
            Neo4jUtils.closeSession(session);
        } catch (Exception e) {
            System.out.println("当前线程：" + Thread.currentThread().getName() + " 出现问题执行插入   " + e.getMessage());
            return;
        }
    }

    private String getCqlSecInsertRelation(Relationship r) {
        String name = r.get("name").asString();
        String equityPercent = r.get("equityPercent").asString();
        String from = r.get("from").asString();
        String to = r.get("to").asString();
        String relation = r.get("relation").asString();
        String cql = String.format(Constant.cql_Sec_Insert_Relation, from, to, name, name, relation, from, to, equityPercent, name, relation, from, to, equityPercent);
        System.out.println(Thread.currentThread().getName() + "  转移关系的cql:  " + cql);
        return cql;
    }

    private List<String> getCqlSecInsertNode(Map<String, Node> nodeMap) {
        List<String> list = new ArrayList<>();
        Iterator<Node> iterator = nodeMap.values().iterator();
        while (iterator.hasNext()) {
            Node next = iterator.next();
            String identity = next.get("identity").asString();
            String name = next.get("name").asString();
            String type = next.get("type").asString();
            String cql = String.format(Constant.cql_Sec_Insert_Nodes, name, name, type, identity, name, type, identity);
            System.out.println(Thread.currentThread().getName() + "  转移节点的cql:  " + cql);
            list.add(cql);
        }
        return list;
    }

    public synchronized String getCqlFirQuery() {
        int skip = neoContext.getSkip();
        String s = Constant.cql_Fir_Search + " skip " + skip + " limit 10";
        System.out.println("[" + Thread.currentThread().getName() + "] " + "处理任务开始" + skip);
        neoContext.setSkip(skip + 10);
        int currentRelationNum = neoContext.getCurrentRelationNum();

        if (neoContext.getSkip() >= 356180 && currentRelationNum >= 356180) {
            return "over";
        }
        return s;
    }
}
