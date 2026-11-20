package com.itszb.test;

import java.lang.reflect.Method;

public class TestAnnotationMethod {
    static void main() throws Exception {
        Class<Task> clazz = Task.class;
        Task task = (Task) clazz.newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(RunMethod.class)){
                // 执行方法
                method.invoke(task);
            }
        }
    }
}
