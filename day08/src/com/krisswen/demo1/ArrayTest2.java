package com.krisswen.demo1;
/*
 * 找出数组中的最大值
 */
public class ArrayTest2 {
    static void main(String[] args) {
        int[] arr = {5,14,200,56,78,90,300};
        // 定义一个变量，接收最大值
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值是:" + max);
    }
}
