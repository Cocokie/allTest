package cons;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
import utils.ConnectionUtil;

public class Consumer2 {
    private final static String QUEUE_NAME = "test_queue_work";

    public String getMessage() {
        Connection c = null;
        String sd="";
        try {
            c = ConnectionUtil.getConnection();
            Channel chl = c.createChannel();
            chl.queueDeclare(QUEUE_NAME, false, false, false, null);
            chl.basicQos(1);
            QueueingConsumer qc = new QueueingConsumer(chl);
            chl.basicConsume(QUEUE_NAME,false,qc);
            int i =1;
            while (true) {
                QueueingConsumer.Delivery delivery = qc.nextDelivery();
                String message = new String(delivery.getBody());
                System.out.println(" ["+(i++)+"] Received '" + message + "'");
                Thread.sleep(1000);
                chl.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sd;
    }

    public static void main(String[] args) {
        new Consumer2().getMessage();
    }
}
