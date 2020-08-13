package 八大排序算法;
//冒泡排序
public class MaoPao {
    public static void main(String[] args) {
        int[] s = {5, 1, 2, 4, 6, 3};
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j] > s[j + 1]) {
                    int temp = s[j];
                    s[j] = s[j + 1];//位置交换
                    s[j + 1] = temp;
                }
            }
        }
        for (int num : s) {
            System.out.println(num);
        }
    }
}
