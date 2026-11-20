package com.itszb.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestUser {

    @Test
    public void test() throws Exception{
        // 获取Class对象
        Class<User> clazz = User.class;
        // 创建实例对象
        Constructor<User> constructor = clazz.getConstructor();
        // 基于构造器对象创建实例对象
        User user = clazz.newInstance();

        // 获取并修改私有变量id
        Field idField = clazz.getDeclaredField("id");
        idField.setAccessible(true);
        idField.set(user,1001);

        // 获取并修改私有变量username
        Field nameField = clazz.getDeclaredField("username");
        nameField.setAccessible(true);
        nameField.set(user,"eric");

        // 获取并修改私有变量age
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(user,18);

        // 输出结果
        System.out.println("id:" + idField.get(user));
        System.out.println("username:" + nameField.get(user));
        System.out.println("age:" + ageField.get(user));
    }
}
