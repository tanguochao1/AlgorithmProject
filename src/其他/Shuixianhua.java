package 其他;/*
 *@author tanguochao
 *@description
 *@date
 */

public class Shuixianhua {
    /*水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身(例如:1^3 + 5^3+ 3^3 = 153)。*/
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 100; i < 999; i++) {
            a = i / 100;//百位
            b = i / 10 % 10;//十位
            c = i % 10;//个位
            if (i == (a * a * a + b * b * b + c * c * c))
                System.out.println(i);
        }
    }
}
