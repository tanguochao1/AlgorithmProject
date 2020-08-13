package 其他;/*
 *@author tanguochao
 *@description
 *@date
 */

import sun.util.resources.CalendarData;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringTest {
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

    }
    public static String getGapTime ( long time){
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


