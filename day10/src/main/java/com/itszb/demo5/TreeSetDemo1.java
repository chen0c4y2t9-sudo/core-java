package com.itszb.demo5;

import java.util.TreeSet;

/**
 * TreeSet集合存储元素特点：
 *    使用TreeSet进行元素的排序，如果存储的元素的自然顺序的元素，那么在存储元素的时候，会按照升序的方式进行排序
 *    如果存储的是对象类型的数据，在输出元素的时候，需要定义排序规则，否则会报错
 * 在定义比较规则的时候，有两种不同的方式：
 *    第一种：在元素所属类上面实现Comparable接口，重写里面的compareTo方法
 *    第二种: 自定义一个比较器类，在该类上面实现Comparator接口，然后实现里面的compare方法，在创建TreeSet集合对象的时候，将自定义的
 *           比较器传入即可。
 */
public class TreeSetDemo1 {
    static void main() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(13);
        set.add(2);
        set.add(78);
        set.add(45);
        set.add(98);
        System.out.println(set);

        TreeSet<Character> set1 = new TreeSet<>();
        set1.add('A');
        set1.add('B');
        set1.add('M');
        set1.add('C');
        System.out.println(set1);

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("A");
        set2.add("D");
        set2.add("C");
        set2.add("G");
        set2.add("M");
        System.out.println(set2);
    }
}
