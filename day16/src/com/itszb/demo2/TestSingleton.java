package com.itszb.demo2;

import org.junit.jupiter.api.Test;

public class TestSingleton {

    @Test
    public void test1(){
        HungrySingleton o1 = HungrySingleton.getInstance();
        HungrySingleton o2 = HungrySingleton.getInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void test2(){
        LazySingleton o1 = LazySingleton.getInstance();
        LazySingleton o2 = LazySingleton.getInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void test3(){
        LazySyncSingleton o1 = LazySyncSingleton.getInstance();
        LazySyncSingleton o2 = LazySyncSingleton.getInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void test4(){
        DoubleCheckLockSingleton o1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton o2 = DoubleCheckLockSingleton.getInstance();
        System.out.println(o1 == o2);
    }

    @Test
    public void test5(){
        SingletonHandler o1 = SingletonHandler.getInstance();
        SingletonHandler o2 = SingletonHandler.getInstance();
        System.out.println(o1 == o2);
    }
}
