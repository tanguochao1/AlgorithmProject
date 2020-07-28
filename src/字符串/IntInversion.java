package 字符串;/*
 *@author tanguochao
 *@description
 *@date 2019/12/16
 */

public class IntInversion {
//    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
//    示例 1:
//
//    输入: 123
//    输出: 321
//
//    示例 2:
//
//    输入: -123
//    输出: -321
//
//    示例 3:
//
//    输入: 120
//    输出: 21
//
//    注意:
//
//    假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

    public static void main(String[] args) {
//        int i = 7;
//        i %= 3 - (2L == 2L ? 1 : 3);//7%(3-1)=1
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        long rs = 0;
        while (x != 0) {
            rs = rs * 10 + x % 10;
            x /= 10;
        }
        return (rs < Integer.MIN_VALUE || rs > Integer.MAX_VALUE) ? 0 : (int) rs;
    }
}

