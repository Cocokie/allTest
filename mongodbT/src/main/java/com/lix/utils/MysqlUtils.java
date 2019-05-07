package com.lix.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MysqlUtils {
    static Statement sta;
    static Properties p;

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
            Connection connection = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
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
            sta = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean insertOne(String target, String name,String state,String percent,String create_Date) {
        String sql = "insert into touzi(target,touziName,state,percent,create_Date) values('" + target + "','" + name + "','" + state + "','" + percent + "','" + create_Date + "')";
        try {
            int i = sta.executeUpdate(sql);
            if(i>0)return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertFenzhi(String target, String bra_name) {
        String sql = "insert into fenzhi(target,name) values('" + target + "','" + bra_name + "')";
        try {
            int i = sta.executeUpdate(sql);
            if(i>0)return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertGD(String target, String bra_name) {
        String sql = "insert into gudong(target,gudongName) values('" + target + "','" + bra_name + "')";
        try {
            int i = sta.executeUpdate(sql);
            if(i>0)return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
