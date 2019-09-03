package com.lix;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customize {
    enum plugin {
        SD_TOU("头上佛"),
        ;
        private String name;

        public String getName() {
            return name;
        }

        plugin(String s) {
            name = s;
        }
    }

    String name = "xx";
    private static final Log LOG = LogFactory.getLog(Customize.class);

    public static void main(String[] args) throws IOException {
        String sd = "{\"plugin_param\":\"{\"account_name\":\"guoxinbaoli\",\"account_type\":\"guoxinplugin\",\"third_param\":\"\"}\",\"outType\":[{\"mode\":\"default\",\"config\":{}}],\"target\":\"神龙汽车有限公司\"}";
        JSONObject jsonObject = JSON.parseObject(sd);
        System.out.println(jsonObject.toString());
    }


    public static int outover(Integer ob) {
        try {
            if (ob == null) {
                System.out.println("是空的返回");
                return 7;
            }
            System.out.println("不是空的");
        } catch (Exception e) {
        } finally {
            System.out.println("执行了");
            return 1;
        }
    }

    public boolean equals(Object o) {
        System.out.println(plugin.SD_TOU);
        System.out.println(plugin.SD_TOU.getName());
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
