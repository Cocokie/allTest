package com.lix.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lix.MongdbUtils;
import com.lix.domain.*;
import com.lix.mapper.*;
import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyController {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sessionFactoryBuilder.build(resourceAsReader);

        SqlSession session = build.openSession();
        String ent_name = "七天酒店（深圳）有限公司";
        try {
            String url = "http://192.168.103.121:14000/getYuanSuDataThird";
            //String url = "http://localhost:14000/getYuanSuDataThird";
            String param = "?token=test" + "&credit_code=&reg_no=&ent_name=" + ent_name + "&org_code=&account_type=khsb";
            String result = null;
            HttpClient hc = HttpClients.createDefault();
            HttpGet get = new HttpGet(url+param);
            HttpResponse hp = hc.execute(get);
            result = EntityUtils.toString(hp.getEntity(), "utf-8");
            System.out.println(result);
            JSONObject document = MongdbUtils.getDocument(ent_name);
            System.out.println(document);
            JSONObject data = document.getJSONObject("data");
            JSONArray yearReportForInvs = data.getJSONArray("yearReportForInvs");
            List<Yearreportforinvs> yearreportforinvs = yearReportForInvs.toJavaList(Yearreportforinvs.class);
            YearreportforinvsMapper mapper = session.getMapper(YearreportforinvsMapper.class);
            for (Yearreportforinvs yearreportforinv : yearreportforinvs) {
                yearreportforinv.setTarget(ent_name);
                mapper.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportAlterStocks = data.getJSONArray("yearReportAlterStocks");
            List<Yearreportalterstocks> yearreportalterstocks = yearReportAlterStocks.toJavaList(Yearreportalterstocks.class);
            YearreportalterstocksMapper mapper2 = session.getMapper(YearreportalterstocksMapper.class);
            for (Yearreportalterstocks sd : yearreportalterstocks) {
                sd.setTarget(ent_name);
                mapper2.insert(sd);
                session.commit();
            }

            JSONArray yearReportSocSecs = data.getJSONArray("yearReportSocSecs");
            List<Yearreportsocsecs> yearreportsocsecs = yearReportSocSecs.toJavaList(Yearreportsocsecs.class);
            YearreportsocsecsMapper mapper3 = session.getMapper(YearreportsocsecsMapper.class);
            for (Yearreportsocsecs yearreportforinv : yearreportsocsecs) {
                yearreportforinv.setTarget(ent_name);
                mapper3.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportWebSiteInfos = data.getJSONArray("yearReportWebSiteInfos");
            List<Yearreportwebsiteinfos> yearreportwebsiteinfos = yearReportWebSiteInfos.toJavaList(Yearreportwebsiteinfos.class);
            YearreportwebsiteinfosMapper mapper4 = session.getMapper(YearreportwebsiteinfosMapper.class);
            for (Yearreportwebsiteinfos yearreportforinv : yearreportwebsiteinfos) {
                yearreportforinv.setTarget(ent_name);
                mapper4.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportAlters = data.getJSONArray("yearReportAlters");
            List<Yearreportalters> yearreportalters = yearReportAlters.toJavaList(Yearreportalters.class);
            YearreportaltersMapper mapper5 = session.getMapper(YearreportaltersMapper.class);
            for (Yearreportalters yearreportforinv : yearreportalters) {
                yearreportforinv.setTarget(ent_name);
                mapper5.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportForGuarantees = data.getJSONArray("yearReportForGuarantees");
            List<Yearreportforguarantees> yearreportforguarantees = yearReportForGuarantees.toJavaList(Yearreportforguarantees.class);
            YearreportforguaranteesMapper mapper6 = session.getMapper(YearreportforguaranteesMapper.class);
            for (Yearreportforguarantees yearreportforinv : yearreportforguarantees) {
                yearreportforinv.setTarget(ent_name);
                mapper6.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportPaidUpCapitals = data.getJSONArray("yearReportPaidUpCapitals");
            List<Yearreportpaidupcapitals> yearreportpaidupcapitals = yearReportPaidUpCapitals.toJavaList(Yearreportpaidupcapitals.class);
            YearreportpaidupcapitalsMapper mapper7 = session.getMapper(YearreportpaidupcapitalsMapper.class);
            for (Yearreportpaidupcapitals yearreportforinv : yearreportpaidupcapitals) {
                yearreportforinv.setTarget(ent_name);
                mapper7.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportBasics = data.getJSONArray("yearReportBasics");
            List<Yearreportbasics> yearreportbasics = yearReportBasics.toJavaList(Yearreportbasics.class);
            YearreportbasicsMapper mapper8 = session.getMapper(YearreportbasicsMapper.class);
            for (Yearreportbasics yearreportforinv : yearreportbasics) {
                yearreportforinv.setTarget(ent_name);
                mapper8.insert(yearreportforinv);
                session.commit();
            }

            JSONArray yearReportSubCapitals = data.getJSONArray("yearReportSubCapitals");
            List<Yearreportsubcapitals> yearreportsubcapitals = yearReportSubCapitals.toJavaList(Yearreportsubcapitals.class);
            YearreportsubcapitalsMapper mapper9 = session.getMapper(YearreportsubcapitalsMapper.class);
            for (Yearreportsubcapitals yearreportforinv : yearreportsubcapitals) {
                yearreportforinv.setTarget(ent_name);
                mapper9.insert(yearreportforinv);
                session.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
