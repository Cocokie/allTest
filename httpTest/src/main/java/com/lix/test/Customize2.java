package com.lix.test;

public class Customize2 {
    public static void main(String[] args) {
        HttpClientProxy hc = new HttpClientProxy();
        byte[] bytes = hc.doGet("https://www.zhujianpt.com/company.html");
        System.out.println(new String(bytes));

    }
}
