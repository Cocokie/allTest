package com.lix;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * aliJSON
 * <p>
 * aliJson继承JSON实现Map,List接口，所以可以当做Map或者List使用
 * <p>
 * 1.字符串转JSON,  JSON.parse(text)
 * <p>
 * 2.对象转JSON（包括）JSON.toJSON(Object)
 * <p>
 * 3.JSON转对象   x.toJavaObject()
 */
public class AliJson {
    public static void main(String[] args) {
        String text = "{'id':1,'name':'头上佛','stus':[{'id':101,'name':'刘一手','age':16}]}";
        String arra = "[{'sty':{'id':101,'name':'刘一手','age':16}},\"777\"]";
        String per = "{'name':'头上佛','age':'6','sex':'2'}";
        JSONObject jb = JSON.parseObject(per);
        JSON.parseObject(jb.toString(), Person.class);
        Person person = jb.toJavaObject(Person.class);
        Map map = jb.toJavaObject(Map.class);
        Person person1 = JSON.toJavaObject(jb, Person.class);
        String sds = "";
        JSONArray a = JSONArray.parseArray(arra);
        JSONObject sjb = JSONObject.parseObject(sds);
        jb.toString();
        jb.toJSONString();
        System.out.println(sds);
        System.out.println(555);
        String name = jb.getString("sd");
        System.out.println("sss");
    }
}
