package 字符串;/*
 *@author tanguochao
 *@description
 *@date 2019/12/16
 */

public class StringOnlyOne {
    //    给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
    public static void main(String[] args) {
        String s = "ilovecode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int[] arrs = new int[26];
        for (int i = 0; i < s.length(); i++)
            arrs[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (arrs[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
