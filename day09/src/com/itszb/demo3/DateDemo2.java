package com.itszb.demo3;

import java.util.Date;

/**
 * Date对象的常见方法
 */
public class DateDemo2 {
    static void main() {
        Date date = new Date();
        System.out.println(date.getTime()); // getTime 获取当前系统时间的毫秒值
        System.out.println(1900 + date.getYear()); // getYear 要在1900年的基础上相加
        System.out.println(date.getMonth() + 1);// getMonth 获取月份，要+1
        System.out.println(date.getDate());// 获取日期部分
        System.out.println(date.getHours()); // 获取小时部分
        System.out.println(date.getMinutes());// 获取分钟部分
        System.out.println(date.getSeconds());// 获取秒部分
        System.out.println(date.getDay());// getDay 获取一个星期的第几天

        Date date1 = new Date();
        date1.setTime(2519817450744L);
        System.out.println(date1); // 根据毫秒值设置时间

        // 比较两个时间的先后
        boolean flag = date.before(date1);
        System.out.println(flag);
        boolean flag2 = date.after(date1);
        System.out.println(flag2);
    }
}
