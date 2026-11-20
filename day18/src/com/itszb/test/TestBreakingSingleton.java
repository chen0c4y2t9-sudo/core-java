package com.itszb.test;

import java.lang.reflect.Constructor;

public class TestBreakingSingleton {
    static void main() throws Exception{
        // 正常单例对象获取
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true

        // 反射破坏
        Class<Singleton> clazz = Singleton.class;
        // 获取构造器
        Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);

        // 创建两个对象
        Singleton s3 = ctor.newInstance();
        Singleton s4 = ctor.newInstance();
        System.out.println(s3 == s4); // false
    }
}
