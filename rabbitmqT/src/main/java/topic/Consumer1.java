package topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
import utils.ConnectionUtil;

public class Consumer1 {
    private final static String QUEUE_NAME = "test_queue_topic_work_1";
    private final static String EXCHANGE_NAME = "test_exchange_topic";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        channel.exchangeDeclare(EXCHANGE_NAME,"topic");

        channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"sss.*");
        channel.basicQos(1);
        QueueingConsumer qc = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME,false,qc);
        while(true){
            QueueingConsumer.Delivery delivery = qc.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println(message);
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
        }
    }
}
