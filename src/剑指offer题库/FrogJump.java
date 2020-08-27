package 剑指offer题库;

import java.util.Arrays;
import java.util.Scanner;

/*一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。*/
public class FrogJump {
    public static void main(String[] args) {
        System.out.print("请输入n的值:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(jump(n));
        System.out.println(JumpFloor(n));
        System.out.println(JumpFloorII1(n));
        System.out.println(JumpFloorII2(n));
    }

    //递归
    public static int jump(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return jump(n - 1) + jump(n - 2);
    }

    //子问题
    public static int JumpFloor(int n) {
        if (n <= 2) {
            return n;
        }
        int p1 = 1, p2 = 2, temp = 0;
        for (int i = 2; i < n; i++) {
            temp = p1 + p2;
            p1 = p2;
            p2 = temp;
        }
        return temp;
    }

    //BT青蛙跳
    //一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
    public static int JumpFloorII1(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }

    public static int JumpFloorII2(int target) {
        return (int) Math.pow(2, target - 1);
    }
}
