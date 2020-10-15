package Queue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 消费者类
 */
public class Consumer implements Runnable {
    private BlockingDeque<String> queue = new LinkedBlockingDeque<String>();

    public Consumer(BlockingDeque<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i = 0;
        do {
            try {
                String product = queue.take();
                if (!"".equals(product) && null != product) {
                    System.out.println("消费者-:" + product);
                    i++;
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } while (i < 50);
    }
}