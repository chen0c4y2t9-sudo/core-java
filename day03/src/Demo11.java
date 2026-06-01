/**
 * while循环的使用，格式:
 * while(循环条件){
 *     循环体
 * }
 *
 * do-while循环的使用
 * do{
 *     循环体
 * }while(循环条件);
 *
 * while循环和do-while循环之间的区别：
 *   while循环，先判断循环条件，再执行循环体；
 *   do-while循环，先执行1次循环体，然后再进行循环条件判断。
 */
public class Demo11 {
    static void main(String[] args) {
       /* int i = 100;
        while(i > 0){ // 描述的是循环条件，只要i>0就可以继续进入到循环
            System.out.println(i);
            i /= 2; // 每次循环都除以2
        }*/

        /*int i = 100;
        while(i > 0){
            if(i < 10){
                break;
            }
            System.out.println(i);
            i /= 2;
        }*/

        int i = 0;
        do{
            System.out.println("hello，world....");
            i++;
        }while (i < 10);
    }
}
