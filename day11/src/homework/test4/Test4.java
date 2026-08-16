package homework.test4;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 95));
        list.add(new Student("李四", 82));
        list.add(new Student("王五", 67));
        list.add(new Student("赵六", 45));
        list.add(new Student("孙七", 78));


        Predicate<Student> p = s -> s.getScore() >= 60;
        ArrayList<Student> passList = new ArrayList<>();
        for (Student s : list) {
            if (p.test(s)) {
                passList.add(s);
            }
        }
        System.out.println("及格学生：");
        for (Student s : passList) {
            System.out.println(s);
        }


        Function<Integer, String> f = score -> {
            if (score >= 90) return "优秀";
            else if (score >= 80) return "良好";
            else if (score >= 60) return "及格";
            else return "不及格";
        };

        System.out.println("所有学生评级：");
        for (Student s : list) {

            String level = f.apply(s.getScore());
            System.out.println(s.getName() + " " + s.getScore() + "分 " + level);
        }
    }
}