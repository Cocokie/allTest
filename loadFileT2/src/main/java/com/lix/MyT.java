package com.lix;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Properties;
import java.util.jar.JarOutputStream;

public class MyT {
    public static void main(String[] args) throws IOException {

        FileInputStream fi = new FileInputStream("loadFileT2/xx.properties");
        File f = new File("loadFileT2/xx.properties");
        //File f = new File("/pom.xml");
        String absolutePath = f.getAbsoluteFile().getAbsolutePath();
        System.out.println(absolutePath);
      /*  Properties p = new Properties();
        InputStream resourceAsStream = MyT.class.getClassLoader().getResourceAsStream("x.properties");
        p.load(resourceAsStream);
        System.out.println(p.getProperty("name"));
        p.put("name","sd");
        JarOutputStream jo = new JarOutputStream(new FileOutputStream("x.properties"));
        p.store(jo,"sdsdsds");
        System.out.println(p.getProperty("name"));*/
    }

}
