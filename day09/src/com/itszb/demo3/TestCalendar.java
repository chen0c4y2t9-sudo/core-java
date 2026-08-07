package com.itszb.demo3;

import java.util.Calendar;

public class TestCalendar {
    static void main(String[] args) {
        // 获取当前系统时间的日历对象
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        // 获取日历对象的年部分
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
        // 获取日历对象的月部分
        int month = instance.get(Calendar.MONTH + 1);
        System.out.println(month);
        // 获取几号
        int day = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        // 获取时间部分（24小时值）
        int hour_day = instance.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour_day);
        // 获取时间部分（12小时值）
        int hour = instance.get(Calendar.HOUR);
        System.out.println(hour);
        // 获取分钟部分
        int min = instance.get(Calendar.MINUTE);
        System.out.println(min);
        // 获取秒部分
        int second = instance.get(Calendar.SECOND);
        System.out.println(second);
        // 获取一个星期的第几天
        int day_of_week = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(day_of_week);
        // 获取一年当中的第几天
        int day_of_year = instance.get(Calendar.DAY_OF_YEAR);
        System.out.println(day_of_year);
    }
}
