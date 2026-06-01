/**
 * 变量相关操作
 *大小写敏感
 * 字母数字下划线
 * 不能用关键字
 */

public class Demo1 {
    public static void main() {
        int a=10;
        System.out.println(a);
        int b;
        b=100;
        System.out.println(b);
        int c,d;
        c=3;
        d=5;
        //d=d+1;
        //d+=1;
        d++;
        System.out.println(d);
        /**
         * 如果一个变量声明之后就是不想被修改
         * 使用final关键字修饰
         * 被final关键字修饰，变量值不允许修改，即为常量
         */
        final int e=1;


    }
}
