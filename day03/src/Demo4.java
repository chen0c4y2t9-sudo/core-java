import java.util.Scanner;

/**
 * 多重if分支语句的使用
 *
 *  如果我们想进行多个条件的判断，程序满足不同的条件，就让其执行不同的分支语句
 *  需求： 根据学生的成绩来进行判断：
 *     学生成绩>=90 输出优秀
 *     学生成绩 >=80 小于90 输出良好
 *     学生成绩 >=60 小于80 输出及格
 *     学生成绩 < 60 输出不及格
 *  多重分支的语法：
 *    if(条件1){
 *        满足条件1执行的代码
 *    }else if(条件2){
 *        满足条件2执行的代码
 *    }else if(条件3){
 *        满足条件3执行的代码
 *    }else{
 *        前面所有条件都不满足，需要执行的代码
 *    }
 */
public class Demo4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int score = sc.nextInt();
        if(score >= 90){ // 分数大于等于90
            System.out.println("成绩优秀");
        }else if(score >= 80){ // 分数大于等于80，小于90
            System.out.println("成绩良好");
        }else if(score >= 60){ // 分数大于等于60，小于80
            System.out.println("成绩合格");
        }else { // 分数小于60
            System.out.println("成绩不合格");
        }
    }
}
