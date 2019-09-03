package com.lix;

public class ClassLoadTT {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoadTT.class.getClassLoader();
        System.out.println(classLoader);
    }}
