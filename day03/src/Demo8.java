/**
 * debugg断点调试的集群：
 *    F8 用于放行当前代码，执行下一行代码
 *    F7 如果当前暂停的这行代码是一个方法，通过F7可以进入到方法的内部
 *    Shift + F8 如果我们进入到方法的内部，此时想从方法的内部跳出来
 *
 * 流程控制语句  -- 循环语句
 *   for循环:
 *      for(表达式1;表达式2;表达式3){
 *          循环体代码
 *      }
 *   表达式1: 在循环开始的之后，只会执行1次。
 *   表达式2: 每次循环开始前都会执行1次,要求为判断语句，用于判断是否可以结束循环，如果结果为true，就继续循环，否则结束循环。
 *   表达式3: 每次循环完成之后，会执行1次
 *   循环体: 满足表达式2需要执行的代码
 *
 */
public class Demo8 {
    static void main(String[] args) {
        //int i = 0;
        for(int i = 0;i<3;i++){
            System.out.println("执行循环操作");
            System.out.println("当前i的值是:" + i);
        }
        // System.out.println(i);

        // 我们可以在for循环里面进行if分支判断。比如我们想判断循环输出的数字是否是偶数
        /*for(int i = 0;i<3;i++){
            System.out.println("当前i的值是:" + i);
            if(i % 2 == 0){
                System.out.println("当前i的一个偶数");
            }else{
                System.out.println("当前i是一个奇数");
            }
        }*/

        // 我们还可以在循环里面嵌套循环
       /* for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println("执行循环操作");
            }
        }*/

        for(;;){ // 如果什么表达式都不写，相当于没有循环结束的条件，导致无限死循环
            System.out.println("开始执行死循环操作");
        }
    }
}
