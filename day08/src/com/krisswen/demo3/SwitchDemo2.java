package com.krisswen.demo3;

public class SwitchDemo2 {
    static void main() {
        Integer i = test("hello");
        System.out.println(i);
    }

    public static Integer test(Object object){
        return switch (object){
            case Point(int _, int y) -> y;
            case String _ -> 10;
            default -> 5;
        };
    }
}
