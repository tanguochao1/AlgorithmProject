package 字符串;
/*
 *@author tanguochao
 *@description  编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
                不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
                你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *@date 2019/12/13
 */

public class StringInverted {
    public static void main(String[] args) {
        char[] ss = {'I', 'L', 'o', 'v', 'e', 'C', 'o', 'd', 'e'};
        System.out.println(reverseString(ss));
    }

    public static char[] reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return s;
        }
        int left = -1;
        int right = s.length;
        while (++left < --right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
        }

        return s;
    }

}
