package 数组类的算法;/*
 *@author tanguochao
 *@description
 *@date
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    /*
    给定两个数组，编写一个函数来计算它们的交集。
    示例 1:
    输入: nums1 = [1,2,2,1], nums2 = [2,2]
    输出: [2,2]
    示例 2:
    输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    输出: [4,9]
    说明：
    输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
    我们可以不考虑输出结果的顺序。*/
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        int[] num3 = {4, 9, 5};
        int[] num4 = {9, 4, 9, 8, 4};
        int[] nums = intersect(num1, num2);
        int[] nums2 = intersect(num3, num4);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        //nums1数组转集合
        for (int num : nums1) {
            list1.add(num);
        }
        //nums2数组转集合
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {//当前列表若包含某元素，返回结果为true, 若不包含该元素，返回结果为false。
//                当list调用contains（）方法并传递一个元素时，会执行遍历，逐个对比item是否等于该元素，当遍历结束后，如果还没有一个元素等于该元素的值，则返回false, 否则返回true
                list2.add(num);
                // 从 list1 除去已匹配的数值
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }
}
