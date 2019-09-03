package com.lix;

public class ClassLoadT {
    static {
        System.out.println("ClassLoadT");
    }

    public static void main(String[] args) {
        System.out.println(int.class.getClassLoader());
    }
}
