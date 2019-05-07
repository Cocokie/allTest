package com.lix;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.jar.JarOutputStream;

public class LoadIng {
    public static void main(String[] args) throws Exception {
        String userPath = System.getProperty("user.dir");
        String path = LoadIng.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(new File("").getAbsolutePath());
        FileInputStream in = new FileInputStream("loadFile/src/main/resources/x.properties");
        String classLoaderPath = LoadIng.class.getClassLoader().toString();

        System.out.println("userPath: "+userPath);
        System.out.println("path: "+path);
        System.out.println("classLoaderPath: "+classLoaderPath);

        System.out.println(System.getProperty("user.dir"));
        Properties p = new Properties();
        System.out.println(LoadIng.class.getClassLoader().getResource("x.properties"));
        System.out.println(LoadIng.class.getResource("/x.properties"));
        InputStream resourceAsStream = LoadIng.class.getResourceAsStream("LoadIng.class");
        InputStream resourceAsStream2 = LoadIng.class.getResourceAsStream("/x.properties");
        String resRootPath = LoadIng.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(resourceAsStream);
        System.out.println(resRootPath);
        p.load(resourceAsStream2);
        System.out.println(p.getProperty("name"));
        System.out.println(resourceAsStream2);
        p.put("name","dsds");
      /*  JarOutputStream jo = new JarOutputStream(new FileOutputStream("x.properties"));

        p.store(jo,"xixi");
        InputStream resourceAsStream1 = LoadIng.class.getClassLoader().getResourceAsStream("x.properties");*/
        //System.out.println(resourceAsStream1);

        System.out.println(new File(".").getAbsolutePath());
        FileInputStream fi = new FileInputStream("loadFile/src/main/resources/x.properties");
        //InputStream resourceAsStream = LoadIng.class.getClassLoader().getResourceAsStream("x.properties");
        Properties pd = new Properties();
        pd.load(resourceAsStream);
        OutputStream o = new FileOutputStream("x.properties");
        String name = pd.getProperty("name");
        pd.put("name","caoyaofang");
        pd.store(o,"777");
        //od.close();
    }
}
