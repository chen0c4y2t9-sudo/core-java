package com.krisswen.demo2;

import java.util.Scanner;

// 接收键盘输入的字符串内容，将字符串的内容遍历出来
public class StringTest1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String message = sc.next();
        // 方式1： 使用split进行切割
        /*for (String string : message.split("")) {
            System.out.println(string);
        }*/

        // 方式2： toCharArray
        /*for (char c : message.toCharArray()) {
            System.out.println(c);
        }*/

        // 方式3：通过charAt方法
        for(int i = 0;i<message.length();i++){
            System.out.println(message.charAt(i));
        }

    }
}
