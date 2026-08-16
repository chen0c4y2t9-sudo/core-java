package com.itszb.demo7;

import java.util.ArrayList;

/**
 * 泛型的通配符：
 * ? extends: 表示传递泛型可以是泛型本身或者其子类
 * ? super:  表示传递的泛型可以是泛型本身或者其父类
 */
public class TestFanXing {
    static void main() {
        ArrayList<GrandFather> list1 = new ArrayList<>();
        ArrayList<Father> list2 = new ArrayList<>();
        ArrayList<Son> list3 = new ArrayList<>();

        method(list1);
        //method(list2);
        //method(list3);

        list1.add(new GrandFather());
        list1.add(new Father());
        list1.add(new Son());

        method1(list1);
        method1(list2);
        method1(list3);

        method2(list1);
        method2(list2);
        method2(list3);

    }

    public static void method(ArrayList<GrandFather> list){}

    public static void method1(ArrayList<? extends GrandFather> list){}
    public static void method2(ArrayList<? super Son> list){}


}
