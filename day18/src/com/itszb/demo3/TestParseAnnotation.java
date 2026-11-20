package com.itszb.demo3;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

// 基于反射解析注解信息
public class TestParseAnnotation {

    // 解析类上面的注解信息
    @Test
    public void test() throws Exception{
        // 获取当前类的字节码文件对象
        Class<AnnotationDemo3> clazz = AnnotationDemo3.class;
        // 判断当前类上面是否存在指定的名称的注解
        if(clazz.isAnnotationPresent(MyAnnotation3.class)){
            // 获取当前的注解对象
            MyAnnotation3 annotation = clazz.getDeclaredAnnotation(MyAnnotation3.class);
            // 获取注解的属性值
            System.out.println(annotation.value()); // 获取value属性值
            System.out.println(annotation.num());// 获取num属性值
            System.out.println(Arrays.toString(annotation.names())); // 获取names属性
            System.out.println(annotation.annotationType());  // 获取当前注解的全限定名
        }
    }

    // 解析方法上面的注解信息
    @Test
    public void test2() throws Exception{
        Class<AnnotationDemo3> clazz = AnnotationDemo3.class;
        // 获取方法对象
        Method method = clazz.getDeclaredMethod("show");
        if(method.isAnnotationPresent(MyAnnotation3.class)){ // 判断在方法上是否存在指定注解
            // 获取当前的注解对象
            MyAnnotation3 annotation = method.getDeclaredAnnotation(MyAnnotation3.class);
            // 获取注解的属性值信息
            System.out.println(annotation.value());
            System.out.println(annotation.num());
            System.out.println(Arrays.toString(annotation.names()));
            System.out.println(annotation.annotationType());
        }
    }
}
