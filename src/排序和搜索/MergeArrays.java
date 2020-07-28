package 排序和搜索;/*
 *@author tanguochao
 *@description 合并两个有序数组
 *@date 2019/12/23
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(merge(nums1, m, nums2, n));
    }

    public static List<Integer> merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        if (nums1.length < m)
            return null;
        if (nums2.length < n)
            return null;
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }
}
