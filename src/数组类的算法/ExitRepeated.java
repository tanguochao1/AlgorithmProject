package 数组类的算法;

import java.util.HashSet;
import java.util.Set;

public class ExitRepeated {
    /*
    * 给定一个整数数组，判断是否存在重复元素。
      如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
    * */
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums2 = {1, 2, 3};
        boolean s = containsDuplicate(nums);
        boolean s2 = containsDuplicate(nums2);
        System.out.println(s);
        System.out.println(s2);
    }

    public static boolean containsDuplicate(int[] nums) {
        //利用set自带的去重和数组作比较得出结果
        Set<Integer> set = new HashSet();
        for (int i : nums) {
            set.add(i);
        }
        if (set.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }
}
