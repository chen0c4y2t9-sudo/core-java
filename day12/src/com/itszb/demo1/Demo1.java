package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * 方法引用：可以理解成lambda表达式的简化操作
 * 它的写法有3种，用到一个操作符"::"
 *   对象::方法名称
 *   类名::静态方法名称
 *   类名::非静态方法名称
 *   类名::new
 */
public class Demo1 {

    @Test
    public void test01(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };
        con.accept("hello");
    }

    @Test
    public void test02(){
        PrintStream ps = System.out;
        // Consumer<String> consumer = s-> System.out.println(s);
        Consumer<String> consumer = s-> ps.println(s);
        consumer.accept("abc");
    }

    @Test
    public void test03(){
        Consumer<String> consumer = System.out::println;
        consumer.accept("heihei");
    }
}
