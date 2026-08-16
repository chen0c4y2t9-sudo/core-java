package com.itszb.test1;

public class BoxTest {
    static void main() {
        Box<String> stringBox = new Box<>();
        stringBox.set("hello,java");
        System.out.println("内容是:" + stringBox.get());
        stringBox.showType();

        System.out.println("---------------");
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);
        System.out.println("内容是:" + integerBox.get());
        integerBox.showType();
    }
}
