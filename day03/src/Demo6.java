/**
 * switch语句的使用，同样也可以适用于各种分支判断
 * switch语句的语法格式:
 *   switch(目标){
 *       case 匹配值1:
 *          代码....
 *          break;
 *      case 匹配值2:
 *         代码....
 *         break;
 *      ....
 *      default:
 *         以上条件都不满足，需要执行的代码;
 *   }
 *   switch语句进行条件的等值判断，它不能进行区间范围判断。
 */
public class Demo6 {
    static void main(String[] args) {
        char c = 'A';
        /*switch (c){
            case 'A': // 如果c = 'A' 就会执行=对应case里面的代码
                System.out.println("去重点班,冲刺985大学");
                break;  // 这里一定要写break,这意味着不会执行其他的case分支，否则会执行下一个case中的代码
            case 'B':
                System.out.println("去平行班，冲刺普通一本");
                break;
            case 'C':
                System.out.println("去职高班深造");
                break;
            default:
                System.out.println("直接进入社会大学");
        }*/

        // 使用if等值判断也可以实现效果
        /*if(c == 'A'){
            System.out.println("去重点班,冲刺985大学");
        }
        if(c == 'B'){
            System.out.println("去平行班，冲刺普通一本");
        }
        if(c == 'C'){
            System.out.println("去职高班深造");
        }*/

        // 在switch语句中还可以嵌套其他流程控制语句
        switch (c){
            case 'A':
                if(c == 'A'){
                    System.out.println("去重点班,冲刺985大学");
                }
                break;
            case 'B':
                System.out.println("去平行班，冲刺普通一本");
                break;
            default:
                System.out.println("直接进入社会大学");
        }
    }
}
