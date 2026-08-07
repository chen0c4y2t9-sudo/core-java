package com.itszb.demo3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    static void main(String[] args) throws Exception{
        // 创建日期格式化对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取当前系统时间的日期对象
        Date date = new Date();
        // format 将一个日期对象转换成指定格式的时间字符串
        String date_str = dateFormat.format(date);
        System.out.println(date_str);

        String date_time = "2021-12-27 20:45:39";
        // parsed 将一个日期格式的字符串转换成一个Date对象
        Date parsed = dateFormat.parse(date_time); // ParseException 编译时异常
        System.out.println(parsed);
    }
}
