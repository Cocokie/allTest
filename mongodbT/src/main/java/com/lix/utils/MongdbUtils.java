package com.lix.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class MongdbUtils {
    public static MongoDatabase mongoDatabase;
    static MongoCollection<Document> collection;
    static {
        try {
            ServerAddress serverAddress = new ServerAddress("192.168.100.179",27018);
            //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码
            MongoCredential credential = MongoCredential.createScramSha1Credential("sjcjb", "Trade", "hpre&-*123".toCharArray());
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();
            credentials.add(credential);

            //通过连接认证获取MongoDB连接
            MongoClient mongoClient = new MongoClient(serverAddress,credentials);
            //连接到数据库
            mongoDatabase = mongoClient.getDatabase("Trade");
            collection = mongoDatabase.getCollection("tianyanchaData");

            System.out.println("Connect to database successfully");
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
    public  static MongoCollection<Document> getCollection(){
        return collection;
    }
    public JSONObject getDocument(String target){
      Document d = new Document("_id",target);
        FindIterable<Document> documents = collection.find(d);
        Document first = documents.first();
        return (JSONObject) JSON.toJSON(first);
    }

    public static void main(String[] args) {
        MongdbUtils.getCollection();
    }
}
