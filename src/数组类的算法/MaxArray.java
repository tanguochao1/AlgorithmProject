package 数组类的算法;

import java.util.concurrent.atomic.AtomicInteger;

/*一个数组，有正有负，算出他相邻子序列（可长可短）的和的最大值*/
public class MaxArray {
    public static void main(String[] args) {
//        ConcurrentHashMap
//        CopyOnWriteArrayList
//        CopyOnWriteArraySet
//        Future
//        ExecutorService
//        ThreadPoolExecutor
//        ScheduledExecutorService
//        ReentrantLock
//        CountDownLatch  //线程顺序调度
//          BlockingDeque//阻塞队列
//        TimeUnit//

        AtomicInteger a=new AtomicInteger();
        System.out.println(a.compareAndSet(100,200));
        System.out.println(a.weakCompareAndSet(100,200));
        int[] nums = {1, -1, -3, 5, 6, -3, 9};
        System.out.println(max(nums));
    }

    public static int max(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (temp < 0) {
                temp = nums[i];
            } else {
                temp += nums[i];
            }
            if (temp > max) {
                max = temp;
            }

        }
        return max;
    }
//    public static int max(int[] nums) {
//        int temp = nums[0] + nums[1];
//        int max = nums[0] + nums[1];
//        for (int i = 0; i < nums.length - 1; i++) {
//            max = nums[i] + nums[i + 1];
//            temp = temp < max ? max : temp;
//        }
//        return temp;
//    }
}
