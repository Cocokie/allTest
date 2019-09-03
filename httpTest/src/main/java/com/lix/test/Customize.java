package com.lix.test;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class Customize {
    public static void main(String[] args) throws IOException {
        Map map = new HashMap<>();
        HttpClientProxy client = new HttpClientProxy();
       /* String url = "https://amr.sz.gov.cn/outer/entSelect/gs.html";
        client.doGet(url, map);
        String codeUrl = "https://amr.sz.gov.cn/outer/validate/getCode.do?timestamp=";
        map.put("Referer", url);
        client.doGet(codeUrl, map);*/
      /*  String cookies = client.getCookies();
        String code = new ChaoJiYing().getCodeInfoProxy(codeUrl, cookies, client);*/
        //url = "https://amr.sz.gov.cn/outer/validate/checkCode.do";
        map.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        //map.put("Cookie", cookies);
        //byte[] status = client.doPost(url, "code=" + code, map);
        //System.out.println(new String(status));
        //String basicInfoUrl = "https://amr.sz.gov.cn/outer/entEnt/detail.do";
        String basicInfoUrl = "https://amr.sz.gov.cn/outer/entEnt/tag.do";
        //byte[] bytes = client.doPost(basicInfoUrl, ("entname=" + URLEncoder.encode("华为技术有限公司", "utf-8") + "&flag=1&unifsocicrediden="), map);
        byte[] bytes2 = client.doPost(basicInfoUrl, ("entname=" + URLEncoder.encode("华为技术有限公司", "utf-8") + "&flag=1&tagId=2&id=05fe9288fcb24499b265a43220702d67&regno=440301103097413&unifsocicrediden=914403001922038216&opetype=GS"), map);
        //System.out.println(new String(bytes));
        System.out.println(new String(bytes2));
    }
}
