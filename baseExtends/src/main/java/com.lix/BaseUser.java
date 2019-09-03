package com.lix;

import sun.misc.ProxyGenerator;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseUser<T> {
   // static String url;

    static {
        System.out.println("super");
    }

    private int i = 555;
    public int n = 666;

    public BaseUser() {
    }

    public void writeLog() {
        System.out.println("fatherLog" + i);
        //* Proxy
        //ProxyGenerator.generateProxyClass()
    }

    public static void main(String[] args) {
        ArrayList x = new ArrayList();
       Map m = new HashMap();

      /*  int k = 1;
        Integer i = 1;
        System.out.println(k==i);*/
//        String s = i + "";
       // System.out.println(i.toString());
        //String s2 = url.intern();
       // System.out.println(url == s2);
      /*  float x = 12;
        System.out.println(x);
        long f = 12;
        float v = x / f;
        System.out.println(v);*/
         int i = 9;
        String str = "xxxx";
        BaseUser test = new BaseUser();
        Person p = new Person("八稚女");
        test.change(i);
        test.changeName(p);
        test.changeString(str);

        System.out.println(i);
        System.out.println(p.name);
        System.out.println(str);

    }

    public void changeString(String str) {
        str = "sss";
    }

    public void change(int x) {
        x = 1234;

    }

    public void changeName(Person p1) {
        p1.name = "头上佛";

    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

