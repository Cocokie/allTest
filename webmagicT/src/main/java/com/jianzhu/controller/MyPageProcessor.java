package com.jianzhu.controller;

import com.jianzhu.constants.TypeConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.model.HttpRequestBody;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.utils.HttpConstant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MyPageProcessor implements PageProcessor {
    boolean flag = false;
    static Spider spider = Spider.create(new MyPageProcessor());
    public static final String basic = "https://www.zhujianpt.com/company/";
    Logger log = LoggerFactory.getLogger(MyPageProcessor.class);
    Site site = Site.me().setRetryTimes(5).setSleepTime(300).setCycleRetryTimes(3).setRetrySleepTime(1000).setTimeOut(20000).addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36").setCharset("utf-8");
    int i = 1;
    List<String> allUrl;
    List<String> allName;

    public void process(Page page) {
        QueueScheduler sd = (QueueScheduler) spider.getScheduler();
        int size = sd.getLeftRequestsCount(null);
        System.out.println("当前队列数量：" + size);
        String code = page.getResultItems().get("code");
        log.debug(page.getUrl().get());
        /*if (flag || (code != null && code.equals("503"))) {
            if (allName.size() > 0) {
                String s = allName.remove(0);
                Request re = new Request(allUrl.remove(0));
                re.putExtra("category", s.substring(0, s.length() - 2));
                page.addTargetRequest(re);
            }

        }*/
        if (page.getUrl().get().equals(TypeConstant.GetUrl.rootUrl)) {
            allUrl = page.getHtml().xpath("//div[@class='aptitude-sequence-container']//dd").links().all();
            allName = page.getHtml().xpath("//div[@class='aptitude-sequence-container']//dd/a/text()").all();
            String s = allName.remove(0);
            Request re = new Request(allUrl.remove(0));
            re.putExtra("category", s.substring(0, s.length() - 2));
            page.addTargetRequest(re);

        }
        //System.out.println("还剩几类: " + allUrl.size());
        if (page.getUrl().get().matches("https://www\\.zhujianpt\\.com/company/.+\\.html")) {
            String cururl = page.getUrl().get();
            String categoryName = (String) page.getRequest().getExtra("category");
            //http://emweb.eastmoney.com/pc_usf10/CompanyInfo/PageAjax?fullCode=ACH.N
            List<String> all = page.getHtml().xpath("//div[@class='name left']/a/text()").all();
            Map m = new HashMap<>();
            for (int i = 0; i < all.size(); i++) {
                m.put("complexname", all.get(i));
                Request re = new Request("http://jzsc.mohurd.gov.cn/dataservice/query/comp/list");
                re.setMethod(HttpConstant.Method.POST);
                re.setRequestBody(HttpRequestBody.form(m, "utf-8"));
                re.putExtra("category", categoryName);
                re.putExtra("target", all.get(i));
                page.addTargetRequest(re);
            }
            String num = page.getHtml().xpath("/html/body/div[3]/div[2]/div[2]/ul[1]/li[2]/strong/strong[1]/text()").get();
            int i = cururl.lastIndexOf("/") + 1;
            int i1 = cururl.lastIndexOf(".");
            String substring = cururl.substring(i, i1);

            String[] split = substring.split("-");
            String pagex = split[4];

            Integer numi = Integer.valueOf(num);
            numi = numi / 20 + 1;
            Integer pagei = Integer.valueOf(pagex);

            if (pagei < numi) {
                substring = substring.substring(0, substring.length() - pagex.length());
                System.out.println("总页数:  " + numi + "  当前页 ：" + pagei);
                pagei++;
                Request re = new Request(basic + substring + pagei + ".html");
                re.putExtra("category", categoryName);
                page.addTargetRequest(re);
            }
           /* if (numi - pagei <= 2) {
                flag = true;
            }*/

        }
        if (page.getUrl().get().contains("http://jzsc.mohurd.gov.cn/dataservice/query/comp/list")) {
            //String s = page.getHtml().get();
            String id = page.getHtml().xpath("//td[@class='text-left primary']").links().get();
            if (id == null) {
                id = "";
            } else {
                id = id.substring(id.lastIndexOf("/") + 1);
            }
            String category = (String) page.getRequest().getExtra("category");
            String target = (String) page.getRequest().getExtra("target");
            System.out.println("当前第" + i++ + "个,id: " + id + "  category: " + category + "  target: " + target);

            page.getResultItems().put("category", category).put("target", target).put("infoId", id);

        }
    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("magic.properties");
        Properties p = new Properties();
        p.load(file);

        String page = p.getProperty("page");
        String category = p.getProperty("category");
        String formatUrl = String.format(TypeConstant.GetUrl.listUrl, category, page);
        Request re = new Request(formatUrl);
        re.putExtra("category", category);
        HttpClientProxy h = new HttpClientProxy();
       /* final String proxyHost = "http-pro.abuyun.com";
        final Integer proxyPort = 9010;
        final String proxyUser = "HPDZ245J4J0265DP";
        final String proxyPass = "FE713FB8F5E24990";
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy(proxyHost, proxyPort, proxyUser, proxyPass)));*/

        spider.addPipeline(new MyPipeline()).setDownloader(h).addRequest(re).thread(3).run();
    }
}
