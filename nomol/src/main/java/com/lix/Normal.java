package com.lix;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.Properties;

public class  Normal {

    public static void main(String[] args) {
        File f = new File("nomol/src/main/resources/x.properties");
        System.out.println(f.getAbsolutePath());
        long l = f.lastModified();
        InputStream in = null;
        String path = "x.properties";
        try {
            Enumeration<URL> res = Normal.class.getClassLoader().getResources(path);
            while (res.hasMoreElements()) {
                URL url = res.nextElement();
                System.out.println(url.toString());
                in = url.openStream();
                String sd =readInputStream(Charset.forName("utf-8"), in);
                System.out.println(sd);

            }
        } catch (IOException e) {

        }
        Properties p = new Properties();
    }
    public static String readInputStream(Charset charset, InputStream in) {
        byte[] bytes = new byte[1024];
        int length = -1;
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        try {
            while ((length = in.read(bytes)) != -1) {
                byteOutput.write(bytes, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(byteOutput.toByteArray(), charset);
    }

}

