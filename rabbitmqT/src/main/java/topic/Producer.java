package topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import utils.ConnectionUtil;

public class Producer {
    private final static String EXCHANGE_NAME = "test_exchange_topic";
    public static void main(String[] args) throws Exception {
        Connection c = ConnectionUtil.getConnection();
        Channel channel = c.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME,"topic");
        String message = "6666666666";
        channel.basicPublish(EXCHANGE_NAME,"ss.A",null,message.getBytes());
        System.out.println(message);
        channel.close();
        c.close();
    }
}
