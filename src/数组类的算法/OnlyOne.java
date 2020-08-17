package 数组类的算法;

public class OnlyOne {
    /*
    * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
      说明：
      你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
       eg: 输入: [4,1,2,1,2]
        输出: 4
    * */
    public static void main(String[] args) {
//        char a='1';
//        String ss=String.valueOf(a);
//        （1）String类型转char[] 类型，使用String类型的toCharArray()方法；
//        （2）char[] 类型转String类型，使用String.valueOf()方法；
        int[] nums = {4, 1, 2, 1, 2};
        int s = singleNumber(nums);
        System.out.println(s);
//        System.out.println(ss);
    }

    public static int singleNumber(int[] nums) {
//        if (nums.length < 2) {
//            return nums[0];
//        }
//        Arrays.sort(nums);
        //用异或来解决这个问题，因为相同的数字异或一定是0，因此重复数字异或后都是0了，0再和一个不为0的数字异或就是它本身了。
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^=nums[i];
        }
        return res;
    }
}


