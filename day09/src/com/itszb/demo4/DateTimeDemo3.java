package com.itszb.demo4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo3 {
    static void main() {
        // 获取当前系统时间的完整时间信息
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime time1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(time1);
        // 根据年月日时分秒构建一个时间对象
        LocalDateTime time2 = LocalDateTime.of(2027, 10, 2, 23, 18, 34);
        System.out.println(time2);

        LocalDate date = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        // 补全时间，在年月日的基础上，补全时分秒
        System.out.println(date.atTime(LocalTime.now()));
        // 补全时间，在具体时间(时分秒)的基础上，补全年月日信息
        System.out.println(localTime.atDate(LocalDate.of(2028,12,21)));

        // 获取完整时间的时分秒部分
        LocalTime localTime1 = time.toLocalTime();
        // 获取完整时间中的年月日部分
        LocalDate localTime2 = time.toLocalDate();
        System.out.println(localTime1);
        System.out.println(localTime2);
    }
}
