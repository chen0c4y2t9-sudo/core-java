package com.itszb.demo4;

import java.time.*;

public class DateTimeDemo5 {
    static void main() {
        // 获取当前系统时间，并且附带时区信息
        OffsetDateTime time = OffsetDateTime.now();
        System.out.println(time);
        OffsetDateTime time1 = LocalDateTime.now().atOffset(ZoneOffset.UTC);
        System.out.println(time1);

        /**
         * 使用LocalDate LocalDateTime虽然可以允许设置时区，但是对应的时间信息不会保留对应的时区
         */
        LocalDate date = LocalDate.now(ZoneId.of("UTC+0"));
        LocalDateTime time2 = LocalDateTime.now(ZoneId.of("UTC+0"));
        System.out.println(date);
        System.out.println(time2);

        // 获取对应的时区信息
        System.out.println(time.getOffset());

    }
}
