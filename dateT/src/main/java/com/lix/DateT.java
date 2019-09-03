package com.lix;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * Date 类 大部分方法过时，迁移到Calendar类
 */
public class DateT {
    public static void main(String[] args) throws ParseException {
        //DateToString();//毫秒转时间
        //StringToDate();//时间转毫秒
        calendar();    //Calendar类的使用
       /* System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(TimeUnit.SECONDS.toSeconds(123));
        System.out.println(TimeUnit.SECONDS);
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);*/

    }

    /**
     * Calendar类的使用
     * instance.get(Calendar.SECOND)此方法可以获取当前时间，一周范围天数，一年范围天数，一天中的秒，小时等等
     */
    private static void calendar() {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTimeInMillis());
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));
        System.out.println(instance.get(Calendar.MINUTE));
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.SECOND));
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(Calendar.DATE);
        DateToString(instance.getTimeInMillis());

    }

    /**
     * 时间转毫秒
     *
     * @throws ParseException
     */
    private static void StringToDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2019-02-12 12:02:01");
        System.out.println(parse.getTime());
    }


    /**
     * 毫秒转时间
     */
    private static void DateToString(Object l) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(l);
        System.out.println(format);
    }

}
