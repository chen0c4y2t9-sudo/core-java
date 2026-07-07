package com.krisswen.demo1;

import com.krisswen.demo2.Worker;
import com.krisswen.pojo.Animal;
import com.krisswen.pojo.Student;

public class TestStudent {
    static void main(String[] args) {
       // Student student = new Student("eric",12,"USA");
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s1 == s2); // 比较两个对象是否是同一个对象

        Animal o1 = Animal.getInstance();
        Animal o2 = Animal.getInstance();
        System.out.println(o1 == o2);

    }
}
