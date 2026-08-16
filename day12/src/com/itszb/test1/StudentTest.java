package com.itszb.test1;

import java.util.Arrays;

public class StudentTest {
    static void main() {
        // 创建学生对象
        Student s1 = new Student(1,"eric",85);
        Student s2 = new Student(2,"james",98);
        Student s3 = new Student(3,"curry",77);
        Student s4 = new Student(4,"kobe",91);
        Student s5 = new Student(5,"mikker",65);

        Student[] students = {s1,s2,s3,s4,s5};

        // 使用静态方法引用，实现学生成绩降序排序
        Arrays.sort(students,StudentUtils::compareByScore);

        // 实现学生信息打印输出
        Arrays.stream(students).forEach(new StudentUtils()::printStudent);
    }
}
