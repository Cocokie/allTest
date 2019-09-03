package com.lix.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Customize {
    public static void main(String[] args) {
        MongoCollection<Document> collection = MongdbUtils.getCollection();
        JSONObject result = null;
        Bson query = new Document("_id", "深圳市万悦房地产开发有限公司");
        Document d = null;

        try {
            d = collection.find(query).first();
        } catch (
                Exception var9) {
            try {
                d = collection.find(query).first();
            } catch (Exception var8) {
                var8.printStackTrace();
            }
        }
        if (d != null) {
            try {
                result = new JSONObject(d);
                result = (JSONObject) JSON.toJSON(d);
            } catch (JSONException var7) {
                var7.printStackTrace();
            }
        }
    }
}
