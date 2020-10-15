package 其他;/*
 *@author tanguochao
 *@description
 *@date
 */

import sun.util.resources.CalendarData;

import java.text.SimpleDateFormat;
import java.util.*;

public class StringTest {
    String name;

    public StringTest(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StringTest stringTest = (StringTest) o;
        return Objects.equals(name, stringTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        String s = "Aug 15, 2020 12:00:00 AM";
        try {
            SimpleDateFormat formatTime = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss aa", Locale.ENGLISH);
            Date date = formatTime.parse(s);
            System.out.println(date);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(format.format(date));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //重写hashcode和equals方法
//        LinkedList
        Map<StringTest, String> map = new HashMap<>(4);
        map.put(new StringTest("hello"), "hello");
        String hello = map.get(new StringTest("hello"));
        System.out.println(hello);
    }

    public static String getGapTime(long time) {
        long hours = time / (1000 * 60 * 60);
        long minutes = (time - hours * (1000 * 60 * 60)) / (1000 * 60);
        String diffTime = "";
        if (minutes < 10) {
            diffTime = hours + ":0" + minutes;
        } else {
            diffTime = hours + ":" + minutes;
        }
        return diffTime;
    }
}


