package exchange;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import utils.ConnectionUtil;

public class Producer {
    private final static String EXCHANGE_NAME = "test_exchange_fanout";

    public static void main(String[] args) throws Exception {
        Connection c = ConnectionUtil.getConnection();
        Channel channel = c.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME,"fanout");
        String message = "Hello World!";
        channel.basicPublish(EXCHANGE_NAME,"",null,message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
        channel.close();
        c.close();
    }
}
