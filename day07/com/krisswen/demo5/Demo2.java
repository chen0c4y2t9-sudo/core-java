package com.krisswen.demo5;

public class Demo2 {
    static void main(String[] args) {
        // 将字符串转换成基本数据类型
        int a = Integer.parseInt("123");
        System.out.println(a);
        // 字符串 --> 包装类
        Integer num = Integer.valueOf("123");
        System.out.println(num);
        // 基本数据类型 --> 字符串
        String string = String.valueOf(123);
        System.out.println(string);
        // 保证类 --> 字符串
        Integer num1 = 234;
        String s = num1.toString();
        System.out.println(s);

        // 类型判断
        System.out.println(Character.isDigit('9')); // 判断是否是一个数字
        System.out.println(Character.isLetter('A'));// 判断是否是一个字母
        System.out.println(Character.isUpperCase('A')); // 判断是否是一个大写
    }
}
