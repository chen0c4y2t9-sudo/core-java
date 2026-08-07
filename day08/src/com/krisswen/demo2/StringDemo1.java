package com.krisswen.demo2;

/**
 * 字符串的特性：
 *  1. 字符串的值被创建之后是不能被修改的，如果要更改，需要创建当前字符串的副本，在副本的基础上进行修改
 *  2. 如果使用直接赋值的方式定义一个字符串对象，如果再创建一个值相同的字符串对象，这两个字符串对象是同一个对象
 *     字符串的创建，还可以使用new关键字来创建，如果使用new关键字创建的两个内容相同的字符串对象，这两个字符串对象不是同一个对象
 */
public class StringDemo1 {
    static void main(String[] args) {
        String username = "eric";
        username += "james";
        System.out.println(username);

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3 == str4);

        String str5 = new String();// 创建内容为空的字符串对象
        System.out.println(str5);

        // 根据char数组创建一个字符串
        char[] chars = {'a','b','c','d','e'};
        //String str6 = new String(chars);
        String str6 = new String(chars,0,3);
        System.out.println(str6);

        // 基于byte类型的数组构建字符串对象
        byte[] bytes = {97,98,99,100};
        String str7 = new String(bytes);
        System.out.println(str7);
    }
}
