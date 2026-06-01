import java.util.Scanner;

/**
 * 对于switch语句的简化
 */
public class Demo7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int score = sc.nextInt();

        // 传统的switch写法
       /* char grade;
        switch(score){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
            case 6:
                grade = 'C';
                break;
            default:
                grade = 'D';
        }
        System.out.println("学生的等级是:" + grade);*/

        // switch语句的增强
        /*char grade =  switch (score){
            case 10,9 -> 'A'; // case后面直接使用->来返回结果，如果多个条件匹配，使用,来分割。
            case 8 -> 'B';
            case 6,7 -> 'C';
            default -> 'D';
        }; // 千万别忘记加; 相当于给grade变量赋值
        System.out.println("学生的等级是:" + grade);*/

        char grade =  switch (score){
            case 9 -> 'A';
            case 8 -> 'B';
            case 6,7 -> {
                System.out.println("我是额外的前置操作");
                yield  'C'; // 可以指定延迟返回的结果。
                // System.out.println("aaa"); yield关键字后面不能有代码，因为关键字代表程序执行结束了
            }
            default -> 'D';
        };
        System.out.println("学生的等级是:" + grade);
    }
}
