package com.lix;

public class Demox extends Demo2 {
    public int k =6;
    public void test() {
        System.out.println("demo1"+k);
    }
    public void test2() {
        System.out.println("demo1"+k);
    }

    @Override
    public String toString() {
        System.out.println("demo1");
        return "Demo1{}";
    }

    public static void main(String[] args) {
        Demo2 in = new Demox();
        System.out.println(in.k);
    }
}
