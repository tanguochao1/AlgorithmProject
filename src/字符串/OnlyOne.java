package 字符串;
//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
public class OnlyOne {
    public static void main(String[] args) {
        String str = "leedcode";
        System.out.println(str.length());
        System.out.println(sameStr(str));
    }

    public static boolean sameStr(String str) {
        return str.chars().distinct().count()==str.length();
    }
}
