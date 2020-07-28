package 数组类的算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeList {
    /**
     * 查询第一个不是 0 的字符的位置
     * @param str 检测的字符串
     * @param regex  检测的字符
     * @return
     */
    public static int getFirst (String str,String regex) {
        int i = 0;
        for (int index = 0;index <= str.length()-1;index++){
            //将字符串拆开成单个的字符
            String w = str.substring(index, index+1);
            if(!regex.equals(w)){//
                i = index;
                System.out.println("第一个不是0的索引："+index+",值为："+w);
                break;
            }
        }
        return i;
    }


    public static void main(String[] args) {
//        getFirst("00000A123", "0");
        String str = "000000001234034120";
        String newStr = str.replaceAll("^(0+)", "");
        System.out.println(newStr);
    }

}
