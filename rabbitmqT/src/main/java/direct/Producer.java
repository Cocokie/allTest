package direct;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import utils.ConnectionUtil;

public class Producer {
    private final static String EXCHANGE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        String sd = "123132";
        channel.basicPublish(EXCHANGE_NAME,"",null,sd.getBytes());
        System.out.println(sd);
        channel.close();
        connection.close();

    }

}
