package 剑指offer题库;

/*将一个字符串中的空格替换成 "%20"
Input:
"A B"

Output:
"A%20B"
*/
public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "A.B";
        StringBuffer stringBuffer=new StringBuffer(s);
        ReplaceSpace replaceSpace = new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace(stringBuffer));
//        System.out.println(s.replaceAll("\\.","3"));
    }

//    public String replaceSpace(String s) {
//        s = s.replace(" ", "%20");
//        return s;
//    }

    public String replaceSpace(StringBuffer str) {
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++)
            if (str.charAt(i) == ' ')
                str.append("  ");

        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }
}
