package 八大排序算法;

import java.util.Arrays;

//插入排序
public class ChaRu {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int value = arr[i];
            int j = 0;//插入的位置
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];//移动数据
                } else {
                    break;
                }
            }
            arr[j + 1] = value; //插入数据
        }
    }
}
