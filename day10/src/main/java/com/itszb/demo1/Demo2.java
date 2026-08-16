package com.itszb.demo1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 需求：如果一个人的姓名和身份证编号是完全一样的，那我们就认定这两个对象是同一个对象
 * 解决方案： 重写equals方法
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person("eric","1001"));
        persons.add(new Person("james","1002"));
        persons.add(new Person("miller","1003"));
        System.out.println(persons);
        /**
         * 这里contains方法是false的原因是：
         *   被比较的Person对象和集合中的Person对象并不是同一个对象，虽然属性值一样的，
         *   但是在创建的时候，在堆内存中分配了不同的空间来维护这两个对象的。
         *
         *  如果想让contains方法返回值为true，只能重新对象所属类的equals方法
         */
        System.out.println(persons.contains(new Person("eric","1001")));
    }
}
