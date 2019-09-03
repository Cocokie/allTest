package com.lix;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongdbUtils {
    public static MongoDatabase mongoDatabase;
    static MongoCollection<Document> collection;
    static {
        try {
            //连接到MongoDB服务 如果是远程连接可以替换“localhost”为服务器所在IP地址
            //ServerAddress()两个参数分别为 服务器地址 和 端口
           /* ServerAddress serverAddress = new ServerAddress("192.168.100.177",27018);


            //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码
            MongoCredential credential = MongoCredential.createScramSha1Credential("CII_khsbUser", "CII_db3_test", "7!khsb$%^".toCharArray());
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();
            credentials.add(credential);

            //通过连接认证获取MongoDB连接
            MongoClient mongoClient = new MongoClient(serverAddress,credentials);

            //连接到数据库
             mongoDatabase = mongoClient.getDatabase("CII_db3_test");
            collection = mongoDatabase.getCollection("businessData");*/

            ServerAddress serverAddress = new ServerAddress("192.168.100.179",27018);


            //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码
            MongoCredential credential = MongoCredential.createScramSha1Credential("sjcjb", "Trade", "hpre&-*123".toCharArray());
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();
            credentials.add(credential);

            //通过连接认证获取MongoDB连接
            MongoClient mongoClient = new MongoClient(serverAddress,credentials);

            //连接到数据库
            mongoDatabase = mongoClient.getDatabase("Trade");
            collection = mongoDatabase.getCollection("YuanSuDataThird");
            System.out.println("Connect to database successfully");
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
    public MongoCollection<Document> getCollection(){
        return collection;
    }
    public static JSONObject getDocument(String target){
      Document d = new Document("_id",target);
        FindIterable<Document> documents = collection.find(d);
        Document first = documents.first();
        return (JSONObject) JSON.toJSON(first);
    }
}
