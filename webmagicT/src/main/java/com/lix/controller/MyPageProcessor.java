package com.lix.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lix.constants.TypeConstant;
import com.lix.domain.Company;
import com.lix.importurl.MySqlDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyPageProcessor implements PageProcessor {
    Logger log = LoggerFactory.getLogger(MyPageProcessor.class);
    static List<Company> list = new ArrayList<>();
    Site site = Site.me().setRetryTimes(3).setSleepTime(100).setCycleRetryTimes(3);
    static int k = 15315;

    public void process(Page page) {
        log.debug(page.getUrl().get());
        if (page.getUrl().get().contains(TypeConstant.GetUrl.OUTUrlSec)) {
            String s = page.getHtml().get();
            String code = (String) page.getRequest().getExtra("code");
            JSONObject jsonObject = JSON.parseObject(page.getRawText());
            JSONObject jbzl = jsonObject.getJSONObject("data");
            JSONObject jb = (JSONObject) jbzl.getJSONArray("gszl").get(0);
            page.putField("gsmc", jb.getString("COMPNAMECN"));
            page.putField("ywmc", jb.getString("COMPNAME"));
            page.putField("code", code);
        }
       /* String url = page.getUrl().get();
        String s1 = ".*"+TypeConstant.GetUrl.SS + ".*";

        Pattern p = Pattern.compile(s1);
        Matcher m = p.matcher(url);
        System.out.println(m.find());*/
       /* k++;
        if(k%50==0){
            list = MySqlDao.getCompanys(k);
            Request req[] = new Request[50];
            getListToString(list,req);
            for (Request request : req) {
                page.addTargetRequest(request);
            }

        }*/
        if (page.getUrl().get().contains(TypeConstant.GetUrl.OUTUrlFir)) {
            //http://emweb.eastmoney.com/pc_usf10/CompanyInfo/PageAjax?fullCode=ACH.N
           String s = page.getHtml().xpath("//ul[@class='F10DA clearfix pl10']//a[2]/@href").get();
            String substring = s.substring(s.lastIndexOf("=") + 1);
            String code = (String) page.getRequest().getExtra("code");
            Request request = new Request(TypeConstant.GetUrl.OUTUrlSec+substring);
            request.putExtra("code",code);
            page.addTargetRequest(request);
        } else if (page.getUrl().get().contains(TypeConstant.GetUrl.SS )) {
            String s = page.getHtml().get();
            String rawText = page.getRawText();
            String code = (String) page.getRequest().getExtra("code");
            JSONObject jsonObject = JSON.parseObject(rawText);
            JSONObject jbzl = jsonObject.getJSONObject("jbzl");
            page.putField("gsmc", jbzl.getString("gsmc"));
            page.putField("ywmc", jbzl.getString("ywmc"));
            page.putField("code", code);

        } else if (page.getUrl().get().contains(TypeConstant.GetUrl.xinsanbUrl)) {
            String code = (String) page.getRequest().getExtra("code");
            String xx = page.getHtml().get();
            String s = page.getHtml().xpath("//div[@class='gsinfo']//tr[1]/td[2]/text()").get();
            page.putField("gsmc", s);
            page.putField("ywmc", "");
            page.putField("code", code);

        } else if (page.getUrl().get().contains(TypeConstant.GetUrl.hongkongUrl)) {

            String s = page.getHtml().get();
            String code = (String) page.getRequest().getExtra("code");

            JSONObject jsonObject = JSON.parseObject(page.getRawText());
            JSONObject jbzl = jsonObject.getJSONObject("gszl");
            page.putField("gsmc", jbzl.getString("gsmc"));
            page.putField("ywmc", jbzl.getString("ywmc"));
            page.putField("code", code);

        } else if (page.getUrl().get().contains(TypeConstant.GetUrl.OUTUrlSec)) {
            String s = page.getHtml().get();
            String code = (String) page.getRequest().getExtra("code");
            JSONObject jsonObject = JSON.parseObject(page.getRawText());
            JSONObject jbzl = jsonObject.getJSONObject("data");
            JSONObject jb = (JSONObject) jbzl.getJSONArray("gszl").get(0);
            page.putField("gsmc", jb.getString("COMPNAMECN"));
            page.putField("ywmc", jb.getString("COMPNAME"));
            page.putField("code", code);
        }
    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        /*list = MySqlDao.getCompanys(k);
        Request req[] = new Request[50];
        getListToString(list,req);*/
/*        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy("101.101.101.101",8888,"username","password")));*/
        Spider.create(new MyPageProcessor()).addPipeline(new MyPipeline()).addUrl("http://emweb.securities.eastmoney.com/PC_HKF10/CompanyProfile/PageAjax?code=04332").run();
    }

    private static void getListToString(List<Company> xx, Request[] req) {

        String[] urlcode = new String[50];
        for (int i = 0; i < xx.size(); i++) {
            Company company = xx.get(i);
            String code = company.getCode();
            String type = company.getType();
            switch (type) {
                case TypeConstant.HONGKONG:
                    urlcode[i] = TypeConstant.GetUrl.hongkongUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.SHANGHAI:
                    urlcode[i] = TypeConstant.GetUrl.shanghaiUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.akc:
                    urlcode[i] = TypeConstant.GetUrl.shanghaiUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.SHANGHAIB:
                    urlcode[i] = TypeConstant.GetUrl.shanghaiUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.SHENZHEN:
                    urlcode[i] = TypeConstant.GetUrl.shenzhenUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.sd:
                    urlcode[i] = TypeConstant.GetUrl.shenzhenUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.sd2:
                    urlcode[i] = TypeConstant.GetUrl.shenzhenUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.SHENZHENB:
                    urlcode[i] = TypeConstant.GetUrl.shenzhenUrl + code;
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.XINSANB:
                    urlcode[i] = TypeConstant.GetUrl.xinsanbUrl + code + ".html";
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                    break;
                case TypeConstant.OUT:
                    urlcode[i] = TypeConstant.GetUrl.OUTUrlFir + code + ".html";
                    req[i]=new Request( urlcode[i]);
                    req[i].putExtra("code",code);
                   /* m.put("code","");
                    req[i].setExtras(m);*/
                    break;
                default:
                    break;
            }
        }
    }
}
