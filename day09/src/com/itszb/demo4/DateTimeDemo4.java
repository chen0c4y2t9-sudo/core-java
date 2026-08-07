package com.itszb.demo4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo4 {
    static void main() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse("2026-10-12 15:34:25", formatter);
        System.out.println(time);

        LocalDateTime time1 = LocalDateTime.from(formatter.parse("2026-10-12 15:34:25"));
        System.out.println(time1);

        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
