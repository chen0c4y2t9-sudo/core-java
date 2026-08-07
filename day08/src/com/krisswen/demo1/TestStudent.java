package com.krisswen.demo1;

import java.util.Scanner;

/**
 * 定义一个数组，存储学生对象
 */
public class TestStudent {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for(int i = 0;i<students.length;i++){
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            System.out.println("请输入学生班级名称:");
            String className = sc.next();
            System.out.println("请输入学生地址:");
            String address = sc.next();
            Student student = new Student(name,age,className,address);
            students[i] = student;
        }
        // 进行对象数组的元素遍历
        for(Student student : students){
            System.out.println("学生姓名:" + student.getName() + "  学生年龄:" + student.getAge() + "  学生班级名称:" + student.getClassName() + "  学生地址:" + student.getAddress());
        }
    }
}
