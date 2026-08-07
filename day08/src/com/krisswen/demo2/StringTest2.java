package com.krisswen.demo2;

import java.util.Scanner;

/**
 * 键盘输入一个字符串，字符串中包括小写的字母、大写的字母，还有数字(0-9)，统计大写字符、小写字符、数字出现的次数。
 */
public class StringTest2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String msg = sc.next();
        // 定义一个变量，统计大写字母出现的次数
        int bigCount = 0;
        // 定义一个变量，统计小写字母出现的次数
        int smallCount = 0;
        // 定义一个变量，统计数字出现的次数
        int numCount = 0;
        for(int i = 0;i<msg.length();i++){
            char c = msg.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                bigCount ++;
            }
            if(c >= 'a' && c <= 'z'){
                smallCount ++;
            }
            if(c >= '0' && c <= '9'){
                numCount++;
            }
        }
        System.out.println("大写字母出现的次数:" + bigCount);
        System.out.println("小写字母出现的次数:" + smallCount);
        System.out.println("数字出现的次数:" + numCount);
    }
}
