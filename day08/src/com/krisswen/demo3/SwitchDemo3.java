package com.krisswen.demo3;

public class SwitchDemo3 {
    static void main(String[] args) {
        Integer i = test(new Container(100));
        System.out.println(i);
    }

    public static Integer test(Container object){
        return switch (object){
            case Container(String str) -> str.length();
            case Container(Integer i) -> i;
            default -> 0;
        };
    }
}
