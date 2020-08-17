package 动态规划;

//给你 n 个非负整数 a1，a2，…，an，每个数代表坐标中的一个点 (i, ai) 。
// 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
// 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//说明：你不能倾斜容器，且 n 的值至少为 2。
//输入：[1,8,6,2,5,4,8,3,7]
//输出：49
public class Water {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] nums) {
        //总结：取高度差最小的值
        int maxA = 0, left = 0, right = nums.length - 1, temp = 0;//定义两个指针
        while (left < right) {//遍历
            if (nums[left] < nums[right]) {//左边高度小于右边高度
                maxA = nums[left] * (right - left);//求面积
                left++;//左指针右移
            } else {
                maxA = nums[right] * (right - left);
                right--;//右指针左移
            }
//            temp = temp < maxA ? maxA : temp;//比较取最大面积
            temp = Math.max(maxA, temp);
        }
        return temp;
    }
}
