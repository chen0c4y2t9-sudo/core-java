package com.itszb.demo4;

import java.time.LocalDate;
import java.time.Month;

/**
 * LocalDate类
 */
public class DateTimeDemo1 {
    static void main() {
        // now 获取当前系统时间的年月日部分
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // of 按照指定的年月日构建日期对象  参数1：年  参数2：月份  参数3：描述一个月的第几天
        LocalDate date1 = LocalDate.of(2026, Month.AUGUST, 20);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2026, 11, 20);
        System.out.println(date2);
        // ofYearDay 用于获取指定年份中第几天的年月日信息
        LocalDate date3 = LocalDate.ofYearDay(2026, 320);
        System.out.println(date3);

        System.out.println("当前月份是:" + localDate.getMonth());
        System.out.println("月份数字:" + localDate.getMonthValue());
        System.out.println("当前年份是:" + localDate.getYear());
        System.out.println("今年的第几天:" + localDate.getDayOfYear());
        System.out.println("这个月的第几天:"+ localDate.getDayOfMonth());
        System.out.println("这周的第几天:" + localDate.getDayOfWeek());

        // plusYears 在当前时间的基础上加指定的年数
        LocalDate date4 = localDate.plusYears(3L);
        System.out.println(date4);
        LocalDate date5 = localDate.plusMonths(3L);
        System.out.println(date5);

        // 在指定的日期上减去指定的时间
        LocalDate date6 = localDate.minusYears(5L);
        System.out.println(date6);

        // 在当前日期对象的基础上进行时间的修改。  withMonth: 修改月份
        LocalDate date7 = localDate.withMonth(5);
        System.out.println(date7);
        LocalDate date8 = localDate.withYear(2030);
        System.out.println(date8);

    }
}
