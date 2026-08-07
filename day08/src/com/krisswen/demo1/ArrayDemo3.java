package com.krisswen.demo1;

/**
 * 如果我们需要获取数组中的所有元素
 *   方式1：通过for循环的方式进行遍历
 *   方式2：增强型for循环
 */
public class ArrayDemo3 {
    static void main(String[] args) {
        int[] arr = {12,45,34,67,89,101};
        /*for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }*/

        for(int e : arr){ // int 数组存储元素的数据类型 e 获取的每个元素放在变量e中， arr数组对象
            System.out.print(e + "\t");
        }
        System.out.println();
        String[] strs = {"java","hadoop","html","spring","oracle"};
        for(String str : strs){
            System.out.print(str + "\t");
        }
    }
}
