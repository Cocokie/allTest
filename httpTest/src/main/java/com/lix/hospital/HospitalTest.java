package com.lix.hospital;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;

public class HospitalTest {
    public static void main(String[] args) {
        MysqlUtils my = new MysqlUtils();
        String name;
        String city;
        String level;
        String description;
        CloseableHttpClient hc = HttpClients.createDefault();
        String url = "https://www.zgylbx.com/index.php?m=content&c=index&a=lists&catid=106&k1=0&k2=0&k3=%E4%B8%89%E7%BA%A7%E7%94%B2%E7%AD%89&k4=&page=";
        HttpGet httpGet = new HttpGet();
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");
        for (int i = 1; i <= 68; i++) {
            System.out.println("第"+i+"页开始...");
            httpGet.setURI(URI.create(url + i));
            CloseableHttpResponse response = null;
            Document parse = null;
            try {
                response = hc.execute(httpGet);
                String s = EntityUtils.toString(response.getEntity(), "utf-8");
                parse = Jsoup.parse(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (parse != null) {
                Elements tbody = parse.getElementsByTag("tbody");
                Element element = tbody.get(0);
                Elements tr = element.getElementsByTag("tr");

                for (int k = 0; k < tr.size(); k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    Elements td = tr.get(k).getElementsByTag("td");
                    if (td.size() == 0) continue;
                    name = td.get(0).text();
                    city = td.get(1).text();
                    level = td.get(2).text();
                    description = td.get(3).text();
                    System.out.println("当前数据:name: " + name + "city: " + city + "level: " + level + "description: " + description);
                    my.insertOne(name, city, level, description);
                }
            }
        }
    }
}
