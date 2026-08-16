package com.itszb.test1;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStudent {
    static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"张三",88.5));
        list.add(new Student(2,"李四",95.0));
        list.add(new Student(1,"张三",88.5));
        list.add(new Student(3,"王五",76.0));
        list.add(new Student(4,"赵六",92.0));

        // 去重保留第一个元素
        ArrayList<Student> newList = new ArrayList<>();
        for(Student s : list){
            if(!newList.contains(s)){
                newList.add(s);
            }
        }

        // 按分数进行降序
        newList.sort(Comparator.comparingDouble(Student::getScore).reversed());

        // 结果输出
        for(Student student : newList){
            System.out.println(student);
        }
    }
}
