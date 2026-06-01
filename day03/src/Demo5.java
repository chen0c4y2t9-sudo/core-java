import java.util.Scanner;

/**
 *  嵌套if语句的使用
 *  需求：根据成绩判断，如果分数60分以下，需要参加补习，30-60补习c++;小于30补习java
 *       60分以上的不参加补习。
 */
public class Demo5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int score = sc.nextInt();
        if(score >= 60){
            System.out.println("成绩合格，不用参加补习....");
        }else{ //  score < 60
            if(score >= 30){
                System.out.println("成绩不合格,需要补习c++");
            }else{ // score < 30
                System.out.println("成绩不合格,需要补习java");
            }
        }
    }
}
