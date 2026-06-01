/**
 * continue关键字：用来跳过本次循环，回到循环开始的地方。准备执行下一轮循环
 * break关键字：用于终止整个循环操作，直接跳到循环的外部
 */
public class Demo9 {
    static void main(String[] args) {
        /*for(int i = 0;i<3;i++){
            if(i == 1){
                continue; // 本次循环不会执行后面的代码，直接回到循环起始的地方，准备开始执行下一次循环操作
            }
            System.out.println("循环操作执行了....");
            System.out.println("当前i的值是:" + i);
        }*/

        /*for(int i = 0;i<3;i++){
            if(i == 1){
                break; // 用于终止所有的循环操作，直接执行到循环体外面
            }
            System.out.println("循环操作执行了....");
            System.out.println("当前i的值是:" + i);
        }*/

        // 嵌套循环中continue的使用
       /* for(int i = 1;i<4;++i){
            for(int j = 1;j<4;++j){
                if(i == j){
                    continue; // 如果存在嵌套循环，continue是回到离它最近的循环，准备执行下一次循环操作（就近原则）
                }
                System.out.println(i + "   " + j);
            }
        }*/

        // 嵌套循环中，break的使用
        for(int i = 1;i<4;++i){
            for(int j = 1;j<4;++j){
                if(i == j){
                    break; // break终止的是内层的for循环操作，也是根据就近原则
                }
                System.out.println(i + "   " + j);
            }
        }
    }
}
