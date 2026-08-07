package com.krisswen.demo5;

public class Demo1 {
    static void main() {
        // 自动装箱，将int类型的20 --> 赋予给Integer类型的变量
        Integer a = 20;
        // 自动拆箱 将Integer类型的对象啊赋予给int类型的变量b
        int b = a;

        // 老式的写法：手动的进行装箱和拆箱
        Integer num = Integer.valueOf(10);
        // 手动的拆箱
        int i = num.intValue();
    }
}
