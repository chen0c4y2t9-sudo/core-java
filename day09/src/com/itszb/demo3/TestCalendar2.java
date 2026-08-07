package com.itszb.demo3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar2 {
    static void main() {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR,2027);
        instance.set(2027,2,-4);
        instance.add(Calendar.MONTH,2);
        Date date = instance.getTime();
        String format_str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(format_str);
    }
}
