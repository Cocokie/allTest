package com.lix.transit;

public class Constant {
    public static final String threadJin = "金";
    public static final String threadMu = "木";
    public static final String threadShui = "水";
    public static final String threadHuo = "火";
    public static final String threadTu = "土";

    public static final String cql_Fir_Search = "MATCH (from)-[r:gra]->(to) RETURN from,r,to";

    public static final String cql_Sec_Insert_Nodes = "merge (n:stu{name: '%s'}) on create set n.name='%s',n.type='%s',n.identity='%s'" +
            "on match set n.name='%s',n.type='%s',n.identity='%s'";
    public static final String cql_Sec_Insert_Relation = "match (from:stu{name:'%s'}) match (to:stu{name:'%s'})" +
            "merge (from)-[r:gra{name:'%s'}]->(to) on create set r.name='%s',r.relation='%s'," +
            "r.from='%s',r.to='%s',r.equityPercent='%s' on match set r.name='%s',r.relation='%s'," +
            "r.from='%s',r.to='%s',r.equityPercent='%s'";
}
