import java.util.Scanner;

public class TestStudent {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第1个学生的学号:");
        String studentId1 = sc.next();
        System.out.println("请输入第1个学生的学生姓名:");
        String name1 = sc.next();
        System.out.println("请输入第1个学生的专业:");
        String major1 = sc.next();
        Student s1 = new Student(studentId1,name1,major1);

        System.out.println("请输入第2个学生的学号:");
        String studentId2 = sc.next();
        System.out.println("请输入第2个学生的学生姓名:");
        String name2 = sc.next();
        System.out.println("请输入第2个学生的专业:");
        String major2 = sc.next();
        Student s2 = new Student(studentId2,name2,major2);

        System.out.println("请输入第3个学生的学号:");
        String studentId3 = sc.next();
        System.out.println("请输入第3个学生的学生姓名:");
        String name3 = sc.next();
        System.out.println("请输入第3个学生的专业:");
        String major3 = sc.next();
        Student s3 = new Student(studentId3,name3,major3);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}
