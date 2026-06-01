/**
 * 关系运算符
 *    > 大于
 *    <<> 小于
 *    == 等于(主要不要和=混淆了，=描述的是赋值运算符，==号目前比较两个数字的大小)
 *    ！= 不等于
 *    >= 大于等于
 *    <&lt>;= 小于等于
 *
 * 逻辑运算符
 *   && 与运算，要求两边的表达式都是true，整个结果才为true
 *   || 或运算，要求两边的表达式中只有1个位true，整个结果才为true
 *   ！ 非运算,一般放在表达式的最前面，表达式用()括起来，就是整个表达式的结果取反。
 *
 *  三元运算符：
 *    判断语句 ? 结果1 : 结果2
 */
public class Demo9 {
    static void main(String[] args) {
        // 多行注释的快捷键  Ctrl + shift  + /
        /*int a = 10,b = 20;
        boolean c = a > b;
        System.out.println(c);

        int num1 = 10;
        int num2 = 10;
        boolean d = num1 != num2;
        System.out.println(d);
        boolean e = num1 == num2;
        System.out.println(e);*/



        // 需求: 判断a是否小于等于100且大于等于60
        // boolean c = 100 >= a >= 60;  报错
      /*  int a = 10;
        boolean c = (100 >= a)  && (a >= 60);
        System.out.println(c);*/

        // 需求：d要么大于10,要么小于0
        /*int d = 150;
        boolean e = d <<> 10 || d > 10;
        System.out.println(e);*/

        int a = -9;
        /**
         * a < 10 表达式为true了。此时a>10的表达式可以不用判定了。
         */
        boolean b = a < 0 || a > 10;
        System.out.println(b);

        int c = 150;
        /**
         *   c < 0  为false。此时可以决定整个表达式的结果为false， 右边的c > 10不会执行
         */
        boolean d = c < 0 &&  c > 10;
        System.out.println(d);


        // 三元运算符
        int age = 20;
        String result = (age > 18) ? "成年人" : "未成年人";
        System.out.println(result);
    }
}
