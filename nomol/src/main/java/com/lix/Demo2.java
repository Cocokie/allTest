package com.lix;

public class Demo2 implements Inters{
    public int k = 7;

    public void test() {
        System.out.println("demo2");
    }
    public void test3() {
        System.out.println("demo3");
    }

    @Override
    public String toString() {
        System.out.println("demo2");
        return "Demo2{}";
    }

    public static void main(String[] args) {
        final Demox d = new Demox();
    }
}
