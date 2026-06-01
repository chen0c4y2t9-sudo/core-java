/**
 * 运算符
 */
public class Demo5 {
    static void main(String[] args) {
        int a = 666;
        int b = a = 777;
        System.out.println(a);
        System.out.println(b);

        int c =  1 + 1;
        int d = a;
        int e = 10;
        int f = d - e;
        System.out.println(c);
        System.out.println(f);

        int g = 5;
        short h = 10;
        // 下面的表达式会报错 short类型的值和int类型的值进行运算，得到的结果也是int类型，此时将一个int类型的结果赋予给short类型的变量，就会出错。
        //short i = g + h;
        int i = g + h;

        int j = 5;
        float k = 3.14f;
        // 这个表达式会报错，一个整型的数据和小数计算，得到的结果肯定也是小数，此时使用整型的变量来接收会报错。
        //short l = j + k;
        float l = j + k;

        int m = 10;
        m = -m; // 变量前面加上-，结果就会变成一个负数
        System.out.println(m);

        // + 号除了进行数值之间的相加运算之外，还可以进行字符串的拼接
        String message = "hello" + "world";
        System.out.println(message);
        String msg = 125 + "abc";
        System.out.println(msg);
        String msg1 = 125 + "126";
        System.out.println(msg1);
        // 不管什么数据类型的值和字符串进行+运算，本质都是做内容的拼接
        String msg2 = "啊这" + true + 1.5 + 25 + 'A';
        System.out.println(msg2);

        int n = 8,o = 3;
        System.out.println("相乘的值是:" + n * o);
        System.out.println("相除的值是:" + n / o); // 获取的不是连个数字相除的真正结果，而是相除运算的商值。
        double p = 8.0,q = 5.0;
        System.out.println(p / q); // 两个小数进行运算，得到的结果也是小数。
        double num1 = 8.0;
        int num2 = 5;
        System.out.println(num1 / num2); // 整数和小数进行运算，得到的结果也是小数。

        int num3 = 10;
        System.out.println(num3 % 3); // 取余数
        System.out.println(17 % 2);  // 一个数字和2相除，余数是1，说明该数字是奇数
        System.out.println(18 % 2);  // 一个数字和2相除，余数是0，说明该数字是偶数

        // 运算符之间也是有优先级的。乘除法优先级高于加减法
        System.out.println(10 + 3 * 4);

        int num4 = 10;
        int num5 = num4 = 8 * -num4 + 10;
        /*
         *  1. 正负号的优先级最高，先计算-num4，得到-10
         *  2. 其次进行乘除法计算  8 * -num4 = -80
         *  3. 接着是进行加减法计算 -80 + 10 = -70
         *  4. 最后进行赋值计算 num4 = -70
         *  5. num4的值赋予给num5，最后的结果也是-70
         * */
        System.out.println(num5);
    }
}
