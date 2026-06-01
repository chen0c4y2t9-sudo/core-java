/**
 * 括号运算符 提升运算优先级
 */
public class Demo6 {
    static void main(String[] args) {
        int a = 10;
        /**
         * 1. 括号的优先级的最高的，如果一个表达式存在多个括号，就从做到右进行计算
         * 2. 先进行左边第一个括号里面表达式的计算：首先是a = 8; 将8这个数字赋给变量a。
         * 3. 接下来进行第二个括号里面表达式的计算： -a + 10 = -8 + 10 = 2
         * 4. 最后进行乘法运算 8 * 2 = 16
         */
        int b = (a = 8) * (-a + 10);
        System.out.println(b);

        /**
         * 如果多个括号之间形成了嵌套关系，优先计算最内层的括号中的表达式，然后依次计算到最外层的括号
         */
        int c = (2 + (3 + 1) * 3) * 2;
        System.out.println(c);

        /**
         * 括号还可以进行数据类型的强制转换
         */
        int d = 10;
        short e = (short)d; // 强制将int类型的变量转化成short类型的变量
        System.out.println(e);

        // 如果两个数字相除，我们想得到相除之后的真正结果.此时可以将其中一方的数据转换成double类型
        int f = 8,g = 5;
        double h = f / (double)g;
        System.out.println(h); // 1.6
    }
}