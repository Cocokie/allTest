package utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
    public static Connection getConnection() throws Exception{
        ConnectionFactory cf = new ConnectionFactory();
        cf.setHost("localhost");
        cf.setPort(5672);
        cf.setVirtualHost("testhost");
        cf.setUsername("admin");
        cf.setPassword("admin");
        Connection ct = cf.newConnection();
        return ct;
    }
}
