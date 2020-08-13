package 字符串;

public class RemoveStringNull {
    public static void main(String[] args) {
        String s="00000000  99";
        String s1=s.replaceAll("\\s*","");
        System.out.println(s1);

    }
//    public String remove(String resource, char ch) {
//        StringBuffer buffer = new StringBuffer();
//        int position = 0;
//        char currentChar;
//
//        while (position)
//        {
//            currentChar = resource.charAt(position++);
//            if (currentChar != ch) buffer.append(currentChar);
//        }
//        return buffer.toString();
//    }
}
