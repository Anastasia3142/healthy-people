package com.emelyan.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataTimeUtil {

    public static final int MILLISECONDS_IN_DAY = 24 * 60 * 60 * 1000;
    public static final long MILLISECONDS_IN_3_HOURS = 3*60*60*1000;

    public static SimpleDateFormat dateFormatYearMonthDay = new SimpleDateFormat("yyyy-MM-dd");

    public static  SimpleDateFormat dateFormatMonthDay = new SimpleDateFormat("E dd.MM");;

    public static Long getDateFormatYearMountDay(String date) throws ParseException {
        return dateFormatYearMonthDay.parse(date).getTime();
    }

    public static Long getDateFormatMountDay(String date) throws ParseException {
        return dateFormatMonthDay.parse(date).getTime();
    }
}
