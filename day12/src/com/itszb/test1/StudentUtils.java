package com.itszb.test1;

public class StudentUtils {

    // 静态方法，根据学生的分数降序排序
    public static int compareByScore(Student s1,Student s2){
        return s2.getScore() - s1.getScore();
    }

    // 实例方法，打印学生信息
    public void printStudent(Student student){
        System.out.println(student.getId() + "-" + student.getName() + "-" + student.getScore());
    }
}
