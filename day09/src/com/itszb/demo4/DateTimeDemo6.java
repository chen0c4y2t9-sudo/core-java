package com.itszb.demo4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeDemo6 {
    static void main() {
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);

        ZonedDateTime time1 = LocalDateTime.now().atZone(ZoneOffset.UTC);
        System.out.println(time1);
        System.out.println(time.getZone());

        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(0, 1);
        System.out.println(instant2);

        // 将Date时间对象转换层Instant对象
        Instant instant3 = new Date().toInstant();
        System.out.println(instant3);
    }
}
