package com.lix;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lix.utils.MongdbUtils;
import com.lix.utils.MysqlUtils;
import com.lix.utils.ReadCompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class Controller {
    MongdbUtils mu;
    MysqlUtils sdsql;

    public static void main(String[] args) throws FileNotFoundException {
        Controller c = new Controller();
        //List<String> companyXls = ReadCompany.getCompanyXlsx();

        int i = 1;
        //int size = companyXls.size();
        //ReadCompany r = new ReadCompany(new FileInputStream("F:/央企数据.xlsx"));
        for (String name : Arrays.asList("深圳市海王星辰健康药房连锁有限公司")) {
            System.out.println("当前第" + (i++) + "/" + 1 + "   " + name);
            JSONObject document = c.mongodb().getDocument(name);
            if (document == null) {
                continue;
            }
             getTouZi(c, i, name, document);
            //getFenzhi(c, i, name, document);
            //getGD(c, i, name, document);
        }

    }

    private static void getTouZi(Controller c, int i, String name, JSONObject document) {
        JSONArray branches = document.getJSONObject("BusinessData").getJSONArray("Invested");
        if (branches != null && branches.size() == 0) {
            return ;
        }

        for (Object ob : branches) {
            JSONObject sd = (JSONObject) ob;
            String bra_name = sd.getString("company_name");
            String state = sd.getString("reg_status");
            String percent = Double.toString(sd.getDouble("inv_rate"));
            if (!percent.equals("-1.0")) {
                percent = percent + "%";
            }else{
                percent="";
            }
            long date = sd.getLong("op_date");
            c.mysql().insertOne(name, bra_name, state, percent, nodate(date));
            //r.writeXlsx("分支机构",name,bra_name);
        }
    }

    private static void getFenzhi(Controller c, int i, String name, JSONObject document) {
        JSONArray branches = document.getJSONArray("branches");
        if (branches != null && branches.size() == 0) {
            i++;
            return ;
        }

        for (Object ob : branches) {
            JSONObject sd = (JSONObject) ob;
            String bra_name = sd.getString("bra_name");
            c.mysql().insertFenzhi(name, bra_name);
            //r.writeXlsx("分支机构",name,bra_name);
        }
        i++;
    }
    private static void getGD(Controller c, int i, String name, JSONObject document) {
        JSONArray branches = document.getJSONArray("shareholders");
        if (branches != null && branches.size() == 0) {
            i++;
            return ;
        }

        for (Object ob : branches) {
            JSONObject sd = (JSONObject) ob;
            String bra_name = sd.getString("shareholder_name");
            c.mysql().insertGD(name, bra_name);
            //r.writeXlsx("分支机构",name,bra_name);
        }
        i++;
    }

    public static String nodate(long date) {
        if (date < 0) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String format = sdf.format(date);
        return format;
    }

    public MongdbUtils mongodb() {
        return mu = new MongdbUtils();
    }

    public MysqlUtils mysql() {
        return sdsql = new MysqlUtils();
    }
}
