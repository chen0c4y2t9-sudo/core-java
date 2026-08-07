package com.itszb.test2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestBirthday {
    static void main() {
        // 定义生日与格式化器
        String birthdayStr = "2000-05-20";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 创建LocaDate对象
        LocalDate birthday = LocalDate.parse(birthdayStr, fmt);
        // 获取今天日期  今天的生日
        LocalDate today = LocalDate.now();
        LocalDate birthdayThisYear = birthday.withYear(today.getYear());

        // 判断是否生日已过
        if(birthdayThisYear.isBefore(today) || birthdayThisYear.isEqual(today)){
            System.out.println("今年生日已过");
            birthdayThisYear = birthdayThisYear.plusYears(1); // 获取下一年的生日
        }else{
            System.out.println("还没有过生日");
        }
        // 计算相差的天数
        long days = ChronoUnit.DAYS.between(today, birthdayThisYear);
        System.out.println("距离下一次过生日还有:" + days + "天");
    }
}
