package com.itszb.demo1;

import java.util.Comparator;

/**
 * 自定义比较器
 */
public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getScore() - o1.getScore();
    }
}
