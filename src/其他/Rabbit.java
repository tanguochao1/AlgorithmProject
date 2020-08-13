package 其他;

import java.util.Scanner;

public class Rabbit {
    //斐波那契数列
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner n = new Scanner(System.in);
        int rabbit = n.nextInt();
        System.out.println("第" + rabbit + "个月的兔子数量为" + fun(rabbit));
        n.close();
    }

    public static int fun(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fun(n - 1) + fun(n - 2);//简单的递归
    }
}
