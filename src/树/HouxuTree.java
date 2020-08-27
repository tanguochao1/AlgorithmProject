package 树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassNameHouxuTree
 * @Description
 * @Author
 * @Date2020/8/20 10:54
 * @Version V1.0
 **/
//后序遍历检查是否是二叉树
public class HouxuTree {
    public static void main(String[] args) {
//        int[] nums = {1, 6, 3, 2, 5};
        int[] nums = {1, 3, 2, 6, 5};
        System.out.println(verift(nums));
    }

    public static Boolean verift(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        int p = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > p) {
                return false;
            }
            while (!queue.isEmpty() && nums[i] < queue.peek()) {
                p = queue.peek();
            }
            //push
        }
        return true;
    }
}

