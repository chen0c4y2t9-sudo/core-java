package com.krisswen.demo1;

public class ArrayDemo2 {
    static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        //arr[3] = 44; // 下标越界
        arr = null; // 不指向数组中的任何数组对象  NullPointerException
        System.out.println(arr[2]);
    }
}
