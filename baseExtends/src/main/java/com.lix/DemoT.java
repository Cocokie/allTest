package com.lix;

import java.lang.reflect.Proxy;

class Country {
    String name;

    void value() {
        name = "China";
        System.out.println(name);
    }
}

class City extends Country {
    String name;

    void value() {
        //super.value();
        name = "Hefei";
        //super.value();//不调用此方法时，super.name返回的是父类的成员变量的值null
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        City c=new City();
        c.value();
    }
}