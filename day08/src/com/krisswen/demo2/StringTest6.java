package com.krisswen.demo2;

import java.util.Scanner;

public class StringTest6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号:");
        String tel = sc.next();
        String number = formatPhoneNumber(tel);
        System.out.println("脱敏之后的手机号是:" + number);
    }

    // 定义一个方法，用来处理手机号
    public static String formatPhoneNumber(String tel){
        // 获取前三位数字
        String start = tel.substring(0,3);
        // 截取最后的4为位数字
        String end = tel.substring(7);
        String newNumber = start + "****" + end;
        return newNumber;
    }
}
