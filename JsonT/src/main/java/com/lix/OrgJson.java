package com.lix;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OrgJson {

    /**
     *
     * @param args
     * org.json
     *
     * org.json 对应的JSONArray和JSONObject  里面分别有一个 List容器和map容器,  Json中的方法有些的是对这个两个的封装；
     *
     * 1. json字符串,对象，list，map    转  JSON，都可以用相应的JSONArray或者JSONObject的构造方法，就是在创建的时候传一个参数
     *
     * 2. JSON   转 json字符串   json.toString()
     *
     * 3. JSON   转  对象         不支持
     *
     * 4. JSON    转  list        json.tolist()
     *
     * 5. JSON    转  map         json.tomap()
     *
     *
     * 注意:使用org.json时；若JSONObject中 的 key 值不存在 ，用JSON.get(key);返回的不是null，而是抛出异常
     *      当JSON 转为 list 或者map 时  ，里面就不含有JSON了，  只有list后者map
     *
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge("18");
        p.setName("八稚女");
        p.setSex("female");
        String text = "{'id':1,'name':'头上佛','stus':[{'id':101,'name':'刘一手','age':16}]}";
        String per = "{'name':'头上佛','age':'6','sex':'2'}";
        String arra = "[{'sty':{'id':101,'name':'刘一手','age':16}},\"777\"]";
        JSONObject jbp = new JSONObject(p);

        JSONArray array = new JSONArray(arra);

        List<Object> ob = array.toList();
        System.out.println(array.toString());
        //JSONObject obss = (JSONObject) ob.get(0);
        //String name2 = obss.getString("name");
        //array.put()
        List<String> s = new ArrayList<String>();
        s.add("2");
        s.add("3");
        s.add("4");
        String sd = s.remove(6);
        s.add(0,"s");


        JSONObject jb = new JSONObject(text);

        String name = jb.getString("name");
        String id = jb.getString("id");
        String xixi = jb.getString("777");
    }
}
