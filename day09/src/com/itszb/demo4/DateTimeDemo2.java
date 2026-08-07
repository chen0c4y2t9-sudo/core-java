package com.itszb.demo4;

import java.time.LocalTime;

public class DateTimeDemo2 {
    static void main() {
        // 获取当前系统时间
        LocalTime time = LocalTime.now();
        System.out.println(time);
        // 指定当前的时间  参数1：小时部分  参数2: 分钟部分
        LocalTime time1 = LocalTime.of(12, 34);
        System.out.println(time1);
        // 指定当前系统时间的时分秒部分
        LocalTime time2 = LocalTime.of(13, 23, 56);
        System.out.println(time2);

        // LocalTime支持的即将到达下一天的最大时间
        LocalTime max = LocalTime.MAX;
        System.out.println(max);
        // 开启一条的起始时间
        LocalTime min = LocalTime.MIN;
        System.out.println(min);
        // 午夜时间
        LocalTime midnight = LocalTime.MIDNIGHT;
        System.out.println(midnight);
        LocalTime noon = LocalTime.NOON;
        // 中午时间
        System.out.println(noon);

        System.out.println("当前时间的时部分:" + time.getHour());
        System.out.println("当前时间的分钟部分:" + time.getMinute());
        System.out.println("当前时间的秒部分:" + time.getSecond());
    }
}
