package com.krisswen.demo4;

public class TestRecord {
    static void main() {
        TestData data1 = new TestData(1, "hello");
        TestData data2 = new TestData(1, "hello");
        System.out.println(data1.equals(data2));
    }
}
