/**
 * if - else语句的使用
 *
 * 需求：如果我们希望条件为true的时候，执行某些代码，条件为false的时候，执行另外的代码。此时可以使用if - else语句来完成
 * if - else语句的格式:
 * if(条件){
 *     执行满足条件的代码
 * }else{
 *     执行不满足条件的代码
 * }
 */
public class Demo3 {
    static void main(String[] args) {
        int age = 19;
        if(age >= 18){ // 条件表达式为true的时候，就会执行if块里面的代码
            System.out.println("当前用户的年龄是:" + age);
            System.out.println("他是成年人");
        }else{  // 条件表达式为false的时候，就会执行else块里面的代码
            System.out.println("当前用户的年龄是:" + age);
            System.out.println("他是未成年人");
        }
    }
}
