package 字符串;/*
 *@author tanguochao
 *@description 最长公共前缀
 *@date 2019/12/17
 */

public class LongestPrefix {
    /*编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。
    示例 1:
    输入: ["flower","flow","flight"]
    输出: "fl"
    示例 2:
    输入: ["dog","racecar","car"]
    输出: ""
    解释: 输入不存在公共前缀。
    说明:
    所有输入只包含小写字母 a-z 。*/

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String str = strs[0];
        //以第一个字符串为最大公共前缀，从第二个字符串开始判断是否存在该前缀，
        // 不存在时将字符串从后开始缩减直到存在，然后挨个遍历字符串数组。
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
