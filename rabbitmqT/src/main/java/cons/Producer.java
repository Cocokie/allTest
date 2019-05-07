package cons;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import utils.ConnectionUtil;

public class Producer {
    private final static String QUEUE_NAME = "test_queue_work";

    public void send() {
        Connection c = null;

        try {
            c = ConnectionUtil.getConnection();
            Channel chl = c.createChannel();
            chl.queueDeclare(QUEUE_NAME,false,false,false,null);
            String message = "Hello World!";
            for (int i = 0; i < 100; i++) {

                 message = "" + i;
                chl.basicPublish("",QUEUE_NAME,null,message.getBytes());
                System.out.println(" [x] Sent '" + message + "'");

                //Thread.sleep(i * 10);
            }
            chl.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Producer().send();
    }
}
