package com.lix.hospital;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MysqlUtils {
    static Statement sta;
    static Properties p;

    public static Connection getConnection() {
        return connection;
    }

    static Connection connection;
    static {
        InputStream resourceAsStream = MysqlUtils.class.getClassLoader().getResourceAsStream("mysql.properties");
         p = new Properties();
        try {
            p.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName(p.getProperty("db.driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       try {
             connection = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
            sta = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MysqlUtils m = new MysqlUtils();
        for (int i=1;i<=100;i++){
            m.getTest();
            System.out.println("创建第" + i);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void getTest(){
        try {
            Connection connection = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
            System.out.println(connection);
            sta = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean insertOne(String name, String city,String level,String description) {
        String sql = "insert into hospital(name,city,level,description) values('" + name + "','" + city + "','" + level + "','" + description + "')";
        try {
            int i = sta.executeUpdate(sql);
            if(i>0)return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
