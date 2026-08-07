package com.krisswen.demo1;

/**
 * 多维数组
 */
public class ArrayDemo4 {
    static void main(String[] args) {
        // int[][] arr = new int[2][10];
        int[][] arr = new int[][]{
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println(arr[2][1]);

        // 遍历多维数组
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
