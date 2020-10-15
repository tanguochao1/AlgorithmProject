package 其他;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatTime {
    public static void main(String[] args) {
        String time = "20200917101736";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HHmm");
        try {
            Date date = sdf.parse(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MINUTE, 60);
            System.out.println(sdf2.format(calendar.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }


//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
//        try {
//            Date date = sdf.parse(time);
//            Date date2 = new Date(date.getTime() + 3600000);
//            System.out.println(sdf2.format(date2));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
