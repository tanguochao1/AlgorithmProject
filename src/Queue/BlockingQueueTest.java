package Queue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 测试类
 * */
public class BlockingQueueTest {

    private static BlockingDeque<String> queue = new LinkedBlockingDeque<String>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Producer producer = new Producer(queue);
        Consumer cusumer = new Consumer(queue);
        new Thread(cusumer).start();
        new Thread(producer).start();
    }
}