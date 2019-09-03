package com.lix;

import sun.misc.Launcher;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class ClassLoadMain {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        ClassLoader classLoaderk = ClassLoadT.class.getClassLoader();
        ClassLoadT t =new ClassLoadT();
        Class.forName("com.lix.ClassLoadT");


        ClassLoader classLoaderx = Launcher.class.getClassLoader();
        System.out.println(classLoaderx);
        String classPath = System.getProperty("java.class.path");
        for (String path : classPath.split(";")) {
            System.out.println(path);
        }

        System.out.println("=========================");
        ClassLoader classLoader1 = ClassLoadT.class.getClassLoader();
        Class<ClassLoadT> classLoadTClass = ClassLoadT.class;

        // Class<ClassLoadT> classLoadTClass = ClassLoadT.class;
        //ClassLoader classLoader1 = ClassLoadT.class.getClassLoader();

        Class<?> aClass = classLoader1.loadClass("com.lix.ClassLoadTT");
        try {
            Class.forName("com.lix.ClassLoadT");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(System.getProperty("java.class.path"));
        //Class<ClassLoadMain> classLoadMainClass = ClassLoadMain.class;
        //System.out.println(new File("").toURI().toURL());
        ClassLoader classLoader = ClassLoadMain.class.getClassLoader();
        //未打成jar包  file:/E:/qdcz-source/allMyT/classLoadT/target/classes/
        //打成jar包  null
        System.out.println("classLoader  " + classLoader.getResource("xxx.properties"));

        //未打成jar包  file:/E:/qdcz-source/allMyT/classLoadT/target/classes/
        //打成jar包  null
        System.out.println("class +/     " + ClassLoadMain.class.getResource("/"));

        //未打成jar包  file:/E:/qdcz-source/allMyT/classLoadT/target/classes/com/lix/
        //打成jar包  jar:file:/E:/qdcz-source/allMyT/classLoadT/target/classLoadT-1.0-SNAPSHOT-jar-with-dependencies.jar!/com/lix/
        System.out.println("class        " + ClassLoadMain.class.getResource("ClassLoadT.class"));

        Properties p = new Properties();
        //未打成jar包 不行
        //打成jar包   这种方式不行
        InputStream re = ClassLoadMain.class.getResourceAsStream("ClassLoadMain.class");
        try {
            if (re != null) {
                System.out.println("ss");
            }
            p.load(re);
            System.out.println("class    " + p.getProperty("name"));
        } catch (Exception e) {
            System.out.println("class    这种方式不行");
        }
        //未打成jar包 行
        //打成jar包 行
        InputStream res = ClassLoadMain.class.getResourceAsStream("/xxx.properties");
        try {
            p.load(res);
            System.out.println("class +/  " + p.getProperty("name"));
        } catch (Exception e) {
            System.out.println("class +/  这种方式不行");
        }
        //未打成jar包 行
        //打成jar包 行
        InputStream rescLoad = classLoader.getResourceAsStream("xxx.properties");
        try {
            p.load(rescLoad);
            System.out.println("classLoader   " + p.getProperty("name"));
        } catch (Exception e) {
            System.out.println("classLoader    这种方式不行");
        }
        //未打成jar包 行
        //打成jar包 行
        URL resource = classLoader.getResource("xxx.properties");
        try {
            p.load(resource.openStream());
            System.out.println("last   " + p.getProperty("name"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
