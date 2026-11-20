package com.itszb.demo3;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationTest {

    public void test01(){
        System.out.println("test01方法执行了.....");
    }

    @MyTest
    public void test02(){
        System.out.println("test02方法执行了.....");
    }

    @MyTest
    public void test03(){
        System.out.println("test03方法执行了.....");
    }

    @MyTest
    public void test04(){
        System.out.println("test04方法执行了.....");
    }

    // 需求: 被@MyTest注解修饰的方法需要被执行
    @Test
    public void test() throws Exception{
        Class<AnnotationTest> clazz = AnnotationTest.class;
        AnnotationTest obj = clazz.newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods){
            if(m.isAnnotationPresent(MyTest.class)){
                // 执行对应的方法
                m.invoke(obj);
            }
        }
    }
}
