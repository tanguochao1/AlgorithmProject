package 字符串;/*
 *@author tanguochao
 *@description 实现 strStr() 函数。
 *@date 2019/12/17
 */

public class ImplementationStr {
    /*
        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
        如果不存在，则返回  -1。
    */
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        return haystack.indexOf(needle);

    }
}
