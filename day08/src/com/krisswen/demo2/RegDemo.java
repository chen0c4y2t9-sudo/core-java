package com.krisswen.demo2;

public class RegDemo {
    static void main() {
        String str = "oooo";
        // +
        System.out.println(str.matches("o+"));
        String str1 = "abcabccaa";
        System.out.println(str1.matches("[abc]*"));
    }
}
