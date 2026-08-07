package com.krisswen.demo2;

public class StringTest5 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String string = formatArray(arr);
        System.out.println(string);
    }
    public static String formatArray(int[] arr){
        String msg = "[";
        for(int i = 0;i< arr.length;i++){
            msg += arr[i] + ",";
        }
        int lastIndex = msg.lastIndexOf(",");
        String newMsg = msg.substring(0,lastIndex);
        return newMsg + "]";
    }
}
