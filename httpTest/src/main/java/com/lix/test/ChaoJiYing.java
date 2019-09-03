package com.lix.test;


import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.security.MessageDigest;
import java.util.*;


/**
 * 超级鹰验证码工具类
 */
public class ChaoJiYing {
    private String username = "hgrx1996";
    private String password = "Qdcz160817";
    private String softid = "891376";
    private String len_min = "1";
    String codeType = "6001";
    private String time_add = "30";
    private String str_debug = "c";


    /**
     * 字符串MD5加密
     *
     * @param s 原始字符串
     * @return 加密后字符串
     */
    public final static String MD5(String s) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 通用POST方法
     *
     * @param url   请求URL
     * @param param 请求参数，如：username=test&password=1
     * @return response
     * @throws IOException
     */
    public static String httpRequestData(String url, String param)
            throws IOException {
        URL u;
        HttpURLConnection con = null;
        OutputStreamWriter osw;
        StringBuffer buffer = new StringBuffer();

        u = new URL(url);
        con = (HttpURLConnection) u.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Content-Type",
                "application/x-www-form-urlencoded");

        osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
        osw.write(param);
        osw.flush();
        osw.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(con
                .getInputStream(), "UTF-8"));
        String temp;
        while ((temp = br.readLine()) != null) {
            buffer.append(temp);
            buffer.append("\n");
        }

        return buffer.toString();
    }

    /**
     * 查询题分
     *
     * @param username 用户名
     * @param password 密码
     * @return response
     * @throws IOException
     */
    public static String GetScore(String username, String password) {
        String param = String.format("user=%s&pass=%s", username, password);
        String result;
        try {
            result = ChaoJiYing.httpRequestData(
                    "http://code.chaojiying.net/Upload/GetScore.php", param);
        } catch (IOException e) {
            result = "未知问题";
        }
        return result;
    }

    /**
     * 注册账号
     *
     * @param username 用户名
     * @param password 密码
     * @return response
     * @throws IOException
     */
    public static String UserReg(String username, String password) {
        String param = String.format("user=%s&pass=%s", username, password);
        String result;
        try {
            result = ChaoJiYing.httpRequestData(
                    "http://code.chaojiying.net/Upload/UserReg.php", param);
        } catch (IOException e) {
            result = "未知问题";
        }
        return result;
    }

    /**
     * 账号充值
     *
     * @param username 用户名
     * @param card     卡号
     * @return response
     * @throws IOException
     */
    public static String UserPay(String username, String card) {

        String param = String.format("user=%s&card=%s", username, card);
        String result;
        try {
            result = ChaoJiYing.httpRequestData(
                    "http://code.chaojiying.net/Upload/UserPay.php", param);
        } catch (IOException e) {
            result = "未知问题";
        }
        return result;
    }

    /**
     * 报错返分
     *
     * @param username 用户名
     * @param password 用户密码
     * @param softid   软件ID
     * @param id       图片ID
     * @return response
     * @throws IOException
     */
    public static String ReportError(String username, String password, String softid, String id) {

        String param = String
                .format(
                        "user=%s&pass=%s&softid=%s&id=%s",
                        username, password, softid, id);
        String result;
        try {
            result = ChaoJiYing.httpRequestData(
                    "http://code.chaojiying.net/Upload/ReportError.php", param);
        } catch (IOException e) {
            result = "未知问题";
        }

        return result;
    }


    /**
     * 核心上传函数
     *
     * @param url   请求URL
     * @param param 请求参数，如：username=test&password=1
     * @param data  图片二进制流
     * @return response
     * @throws IOException
     */

    public static String httpPostImage(String url, String param,
                                       byte[] data) throws IOException {
        long time = (new Date()).getTime();
        URL u = null;
        HttpURLConnection con = null;
        String boundary = "----------" + MD5(String.valueOf(time));
        String boundarybytesString = "\r\n--" + boundary + "\r\n";
        OutputStream out = null;

        u = new URL(url);

        con = (HttpURLConnection) u.openConnection();
        con.setRequestMethod("POST");
        //con.setReadTimeout(60000);
        con.setConnectTimeout(60000);
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setUseCaches(true);
        con.setRequestProperty("Content-Type",
                "multipart/form-data; boundary=" + boundary);

        out = con.getOutputStream();

        for (String paramValue : param.split("[&]")) {
            out.write(boundarybytesString.getBytes("UTF-8"));
            String paramString = "Content-Disposition: form-data; name=\""
                    + paramValue.split("[=]")[0] + "\"\r\n\r\n" + paramValue.split("[=]")[1];
            out.write(paramString.getBytes("UTF-8"));
        }
        out.write(boundarybytesString.getBytes("UTF-8"));

        String paramString = "Content-Disposition: form-data; name=\"userfile\"; filename=\""
                + "chaojiying_java.gif" + "\"\r\nContent-Type: application/octet-stream\r\n\r\n";
        out.write(paramString.getBytes("UTF-8"));

        out.write(data);

        String tailer = "\r\n--" + boundary + "--\r\n";
        out.write(tailer.getBytes("UTF-8"));

        out.flush();
        out.close();

        StringBuffer buffer = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(con
                .getInputStream(), "UTF-8"));
        String temp;
        while ((temp = br.readLine()) != null) {
            buffer.append(temp);
            buffer.append("\n");
        }

        return buffer.toString();
    }

    /**
     * 识别图片_按图片文件路径
     *
     * @param username  用户名
     * @param password  密码
     * @param softid    软件ID
     * @param codetype  图片类型
     * @param len_min   最小位数
     * @param time_add  附加时间
     * @param str_debug 开发者自定义信息
     * @param filePath  图片文件路径
     * @return
     * @throws IOException
     */

    public static String PostPic(String username, String password,
                                 String softid, String codetype, String len_min, String time_add, String str_debug,
                                 String filePath) {
        String result = "";
        String param = String
                .format(
                        "user=%s&pass=%s&softid=%s&codetype=%s&len_min=%s&time_add=%s&str_debug=%s",
                        username, password, softid, codetype, len_min, time_add, str_debug);
        try {
            File f = new File(filePath);
            if (null != f) {
                int size = (int) f.length();
                byte[] data = new byte[size];
                FileInputStream fis = new FileInputStream(f);
                fis.read(data, 0, size);
                if (null != fis) fis.close();

                if (data.length > 0)
                    result = ChaoJiYing.httpPostImage("http://upload.chaojiying.net/Upload/Processing.php", param, data);
            }
        } catch (Exception e) {
            result = "未知问题";
        }


        return result;
    }

    /**
     * 识别图片_按图片二进制流
     *
     * @ username  用户名 hgrx1996
     * @ password  密码 helloworld
     * @ softid    软件ID 891376
     * @ codetype  图片类型
     * @ len_min   最小位数
     * @ time_add  附加时间
     * @ str_debug 开发者自定义信息
     * @ byteArr   图片二进制数据流
     * @return
     * @throws IOException
     */



    public static String getLocalIp() {
        String hostAddress = "";
        try {
            InetAddress address = InetAddress.getLocalHost();
            hostAddress = address.getHostAddress();
            return hostAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostAddress;
    }
    public  String GetVeriCodeFromAPI(BufferedImage image) throws IOException {
        String PROXY_API = "http://47.107.237.167:8001/chaojiying/image";
        if (image == null) {
            return null;
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", bos);
        //CJYConfig cjyConfig = new CJYConfig();
        //cjyConfig.load(ChaoJiYing.class.getClassLoader().getResourceAsStream(CJYConfig.config_path));


//        String time_add = cjyConfig.getTime_add();
//        String str_debug = cjyConfig.getStr_debug();

        Map<String, String> data = new HashMap<>();
        data.put("userName", username);
        data.put("passWord", password);
        data.put("softId", softid);
        data.put("codeType", codeType);
        data.put("lenMin", len_min);
        String imageBase64Str =(new BASE64Encoder()).encodeBuffer(bos.toByteArray());
        data.put("byteParam", imageBase64Str);
        String body = send(PROXY_API, data, "utf-8");

        JSONObject js =JSONObject.parseObject(body);
        String captcha = js.getString("pic_str");
        if (captcha == null) {
            return null;
        }
        return captcha;
    }

    public static String send(String url, Map<String, String> map, String encoding) throws ParseException, IOException {
        String body = "";
        try {
            CloseableHttpClient client = HttpClients.createDefault();  //创建httpclient对象
            HttpPost httpPost = new HttpPost(url);  //创建post方式请求对象
            List<NameValuePair> nvps = new ArrayList<NameValuePair>(); //装填参数
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                }
            }
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));  //设置参数到请求对象中

            //设置header信息
            //指定报文头【Content-type】、【User-Agent】
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
            httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

            CloseableHttpResponse response = client.execute(httpPost);  //执行请求操作，并拿到结果（同步阻塞）
            HttpEntity entity = response.getEntity();  //获取结果实体
            if (entity != null) {
                body = EntityUtils.toString(entity, encoding);  //按指定编码转换结果实体为String类型
            }
            EntityUtils.consume(entity);
            response.close();  //释放链接
        }catch (Exception e){
            e.printStackTrace();
        }
        return body;
    }

    public String getCodeInfoProxy(String img_url, String coo, Object downloadWay) {
        String code = "";
        try {
            //设置cookie
            Map<String, String> mp = new HashMap<>();
            //获取验证码图片
            byte[] image = new byte[0];
            for (int j = 0; j < 3; j++) {
                if (image.length == 0 || image == null) {
                    HttpClientProxy client = (HttpClientProxy) downloadWay;
                        image = client.doGet(img_url, mp);
                    }
            }
            ByteArrayInputStream in = new ByteArrayInputStream(image);
            BufferedImage images;
            images = ImageIO.read(in);
            for (int j = 0; j < 3; j++) {
                if (images == null) {
                    in = new ByteArrayInputStream(image);
                    images = ImageIO.read(in);
                } else {
                    break;
                }
            }
            //获取验证码
             code  = GetVeriCodeFromAPI(images);//验证码
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code;
    }

}
