package 八大排序算法;

import java.util.Arrays;

//选择排序
public class Choose {
    public static void main(String[] args) {
//        int[] a = new int[]{2, 1, 6, 7, 8, 5, 3, 5};
//        sort(a);
//        System.out.println(Arrays.toString(a));
        String s="\u4f18\u79c0";
        System.out.println(s);
    }
    public static void sort(int[] arr) {
        int min = -1;
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {//min从0开始，j从1开始
                if (arr[j] < arr[min]) {//第二个小于第一个
                    min = j;//min和j交换
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
