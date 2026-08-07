package com.itszb.demo3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 通过键盘输入，输入任意的年份，然后计算出当前年份的2月份最后一天是几号？
 */
public class TestDate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,3);
        // 将日期向前推一天
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
        System.out.println(format);
    }
}
