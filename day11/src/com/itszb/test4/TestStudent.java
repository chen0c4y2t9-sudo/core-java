package com.itszb.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudent {

    // 定义一个成绩筛选的方法 Predicate接口
    public static List<Student> filterPassStudent(List<Student> list, Predicate<Student> pre){
        List<Student> passList = new ArrayList<>();
        for(Student student : list){
            passList.add(student);
        }
        return passList;
    }

    // 成绩评级的方法
    public static String getScoreGrade(int score, Function<Integer,String> func){
        return func.apply(score);
    }

    static void main() {
        // 初始化学生信息的集合
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("小明",95));
        studentList.add(new Student("小红",88));
        studentList.add(new Student("小刚",65));
        studentList.add(new Student("小丽",52));
        studentList.add(new Student("小亮",79));

        // 筛选及格学生
        List<Student> passList = filterPassStudent(studentList, s -> s.getScore() >= 60);
        System.out.println("====及格学生列表====");
        passList.forEach(s-> System.out.println(s));

        // 遍历所有学生，获取学生评级
        System.out.println("====所有学生的评级====");
        for(Student s : studentList){
            String grade = getScoreGrade(s.getScore(),score->{
                if(score >= 90) return "优秀";
                else if (score >=80) return "良好";
                else if (score >=60) return "及格";
                else return "不及格";
            });
            System.out.println("姓名:" + s.getName() + ",成绩:" + s.getScore() + ",评级:" + grade );
        }
    }
}
