package com.itszb.demo1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo6 {
    static void main() {
        // 遍历集合中元素的方式1：通过循环的方式
        List<String> list = Arrays.asList("AAA","BBB","CCC");
        /*
        for(String s : list){
            System.out.println(s);
        }*/

        // 遍历集合中元素的方式2：通过迭代器
        /*Iterator<String> iterator = list.iterator(); // 获取集合的迭代器
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }*/

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            iterator.next();
        }

        // 逆序输出
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
