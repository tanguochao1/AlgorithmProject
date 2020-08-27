package 其他;

//import lombok.extern.slf4j.Slf4j;
import sun.font.FontDesignMetrics;

import java.awt.*;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.awt.Font.PLAIN;

/**
 * font工具类
 */
//@Slf4j
public class FontUtil {
    /**
     * 获取默认字体
     *
     * @return
     */
    public static Font getDefaultFont() {
        return new Font(null);
    }

    /**
     * 获取字符串长度
     *
     * @param font 字体
     * @param str  字符串
     * @return
     */
    public static int getStringLength(Font font, String str) {
//        if (StringUtils.isEmpty(str)) {
//            return 0;
//        }
        if (null == font) {
            font = getDefaultFont();
        }
        FontDesignMetrics metrics = FontDesignMetrics.getMetrics(font);

        char[] strcha = str.toCharArray();
        int strWidth = metrics.charsWidth(strcha, 0, str.length());
        return strWidth;
    }


    /**
     * 获取应该换行前的最大字符串
     *
     * @param font      字体
     * @param str       字符串
     * @param maxLength 最大长度
     * @return
     */
    public static String strSplitMaxLenth(Font font, String str, int maxLength) {
//        if (StringUtils.isEmpty(str) || maxLength < 1) {
//            return str;
//        }
        if (null == font) {
            font = getDefaultFont();
        }
        FontDesignMetrics metrics = FontDesignMetrics.getMetrics(font);
        String max_Str = str;

        int width = 0;
        for (int i = 0; i < str.length(); i++) {
            width += metrics.charWidth(str.charAt(i));
            if (width > maxLength) {
                //上一个长度
                max_Str = str.substring(0, i);
                break;
            }
        }
        return max_Str;
    }

    /**
     * 是否是最长的字符串，如果是true，就不需要再次进行截断
     *
     * @param font      字体
     * @param str       字符串
     * @param maxLength 最大长度
     * @return
     */
    public static boolean isMaxStr(Font font, String str, int maxLength) {
//        if (StringUtils.isEmpty(str) || maxLength < 1) {
//            return true;
//        }
        if (null == font) {
            font = getDefaultFont();
        }
        CopyOnWriteArrayList s=new CopyOnWriteArrayList();
        FontDesignMetrics metrics = FontDesignMetrics.getMetrics(font);
        int width = 0;
        for (int i = 0; i < str.length(); i++) {
            width += metrics.charWidth(str.charAt(i));
            if (width > maxLength) {
                return false;
            }
        }
        return width <= maxLength;

    }

    public static void main(String[] args) {
        Font font = new Font("仿宋_GB2312", PLAIN, 12);
        String str1 = "你"; //12
//        String str = "你A"; //21
//        String str = "90.07 成都理工大学矿产普查与勘探"; //12-196 14-226 、16-258
        String str2 = "90.07 成都理工大学矿产普查与勘"; //12-184
        int len = getStringLength(font, str1);
        System.out.println(len);
//        log.info("长度 = {}", len);
    }
}
