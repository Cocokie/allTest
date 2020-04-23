package com.lix.test;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.*;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HttpClientProxy extends HttpClient {
    // 代理服务�?
    private final static String proxyHost = "http-pro.abuyun.com";
    private final static Integer proxyPort = 9010;

    // 代理隧道验证信息
    private final static String proxyUser = "HPDZ245J4J0265DP";
    private final static String proxyPass = "FE713FB8F5E24990";
    private static PoolingHttpClientConnectionManager cm;
    private static HttpHost proxy;

    private static CredentialsProvider credsProvider;
    private static RequestConfig reqConfig;

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.117 Safari/537.36";
    private static final String DEFAULT_CHARSET = "UTF-8";

    private CookieStore cookieStore = new BasicCookieStore();
    private int statusCode;

    static class TrustAllHostNameVerifier implements HostnameVerifier {
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }

    static {
        ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
        //LayeredConnectionSocketFactory sslsf = SSLConnectionSocketFactory.getSocketFactory();

        //默认不验证SSL证书
        SSLConnectionSocketFactory sslsf = null;
        try {
            // TODO Ignore the SSL certificate and host name verifier which should not be ignored in production.
            SSLContextBuilder sslBuilder = new SSLContextBuilder();
            sslBuilder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            sslsf = new SSLConnectionSocketFactory(
                    sslBuilder.build(),
                    new TrustAllHostNameVerifier());
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
            e.printStackTrace();
        }
        Registry registry = RegistryBuilder.create()
                .register("http", plainsf)
                .register("https", sslsf)
                .build();

        cm = new PoolingHttpClientConnectionManager(registry);
        cm.setMaxTotal(20);
        cm.setDefaultMaxPerRoute(5);

        proxy = new HttpHost(proxyHost, proxyPort, "http");

        credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(proxyUser, proxyPass));

        reqConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(5000)
                .setConnectTimeout(5000)
                //.setSocketTimeout(5000)
//                .setExpectContinueEnabled(false)
                .setProxy(new HttpHost(proxyHost, proxyPort))
                .build();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    private byte[] doRequest(HttpRequestBase httpReq) {
        CloseableHttpResponse httpResp = null;
        byte[] data = null;
        try {
            httpReq.setConfig(reqConfig);
            CloseableHttpClient httpClient = HttpClients.custom()
                    .setConnectionManager(cm)    //从连接池那已经配好参数的HttpClientd连接，如可认�?
                    .setDefaultCredentialsProvider(credsProvider)//配置验证帐号信息，以及验证范�?
                    .setDefaultCookieStore(cookieStore)
                    .build();

            AuthCache authCache = new BasicAuthCache();
            //对指定的主机验证
            authCache.put(proxy, new BasicScheme());

            HttpClientContext localContext = HttpClientContext.create();
            localContext.setAuthCache(authCache);

            httpResp = httpClient.execute(httpReq, localContext);

             statusCode = httpResp.getStatusLine().getStatusCode();
            HttpEntity entity = httpResp.getEntity();
            data = EntityUtils.toByteArray(entity);
            Thread.sleep(3000);

//            PenaltyInfo.logUtils.userInfoLog(statusCode + "  " + httpReq.getURI());
            System.out.println(statusCode + "  " + httpReq.getURI());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpResp != null&&data!=null) {
                    httpResp.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public Map<String, String> getCookie() {
        Map<String, String> res = new HashMap<>();
        List<Cookie> cookies = cookieStore.getCookies();
        for (Cookie cookie : cookies) {
            res.put(cookie.getName(), cookie.getValue());
        }
        return res;
    }

    public String getCookies() {
        StringBuilder res = new StringBuilder();
        List<Cookie> cookies = cookieStore.getCookies();
        for (Cookie cookie : cookies) {
            res.append(cookie.getName()).append("=").append(cookie.getValue()).append(";");
        }
        return res.toString();
    }

    /**
     * 设置请求�?
     *
     * @param httpReq http请求对象
     * @param map     header容器
     */
    private void setHeaders(HttpRequestBase httpReq, Map<String, String> map) {
        if (!map.containsKey("User-Agent")) {
            map.put("User-Agent", USER_AGENT);
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            httpReq.setHeader(key, map.get(key));
        }
    }

    public byte[] doPost(String url, String body, Map<String, String> headers) {
        byte data[] = null;
        int tryNum = 3;
        while ((tryNum--) != 0 && data == null) {
            // 要访问的目标页面
            HttpPost httpPost = new HttpPost(url);
            // 设置参数
            HttpEntity entity = new StringEntity(body,"utf-8");
          /*  HttpEntity entity = new ByteArrayEntity(body);*/
            httpPost.setEntity(entity);
            // 设置请求�?
            setHeaders(httpPost, headers);
            data = doRequest(httpPost);
        }
        return data;
    }

    public byte[] doGet(String url, Map<String, String> headers) {
        // 要访问的目标页面
        byte[] data = null;
        int tryNum = 3;
        while ((tryNum--) != 0 && data == null) {
            HttpGet httpGet = new HttpGet(url);
            setHeaders(httpGet, headers);
            data = doRequest(httpGet);
        }
        return data;
    }

    public byte[] doGet(String url) {
        return doGet(url, new HashMap<String, String>());
    }
}