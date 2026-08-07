package com.krisswen.demo1;

import java.util.Scanner;

/**
 * 练习：结合键盘输入，将用户在键盘上输入的数字保存在数组中
 */
public class ArrayTest1 {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            System.out.println("请输入分数:");
            arr[i] = sc.nextInt();
        }

        // 输出在数组中存储的分数：
        for(int score : arr){
            System.out.println(score);
        }
    }
}
