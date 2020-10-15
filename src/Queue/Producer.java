package Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
/**
 * 生产者类
 * */

public class Producer implements Runnable {
    private BlockingDeque<String> queue = new LinkedBlockingDeque<String>();

    public Producer(BlockingDeque<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0; i < 50; i++){
            try {
                System.out.println("生产者-Product"+i);
                queue.put("Prodect:"+i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}