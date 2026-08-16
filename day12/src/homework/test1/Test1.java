package homework.test1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "张三", 85),
                new Student(2, "李四", 92),
                new Student(3, "王五", 78),
                new Student(4, "赵六", 95),
                new Student(5, "孙七", 88)
        };

        Arrays.sort(students, StudentUtil::compareByScore);

        StudentUtil util = new StudentUtil();
        Arrays.stream(students).forEach(util::printStudent);
    }
}
