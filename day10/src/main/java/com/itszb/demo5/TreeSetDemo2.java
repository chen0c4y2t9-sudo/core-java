package com.itszb.demo5;

import java.util.TreeSet;

public class TreeSetDemo2 {
    static void main() {
        TreeSet<Employee> set = new TreeSet<>(new MyComparator());
        set.add(new Employee("eric",2000));
        set.add(new Employee("james",1780));
        set.add(new Employee("kobe",2312));
        set.add(new Employee("lily",4567));
        System.out.println(set);
    }
}
