/**
 * 自增自减运算符的使用
 */
public class Demo7 {
    static void main(String[] args) {
        int a = 8;
        // a =  a + 1;
        // a++; a++ 对a进行加1运算
        // a--;

        // ++a;
        // --a;

        /**
         *  a++  ++号在变量名称的后面
         *   a++ 表达式的结果依然为8,（自加之前的状态），
         *   a的值是+1之后的结果，也就是9
         */
        //int b = a++;

        /**
         *  ++a  ++号是放在变量名称的前面
         *   ++a 会先进行自加计算，得到一个+1运算后的结果，然后也会把这个运算之后的结果重新赋予给变量
         */
        // int b = ++a;

        /**
         *  a++ 等于8，所以-a++ 等于-8. 此时的a=9了；
         *  ++a 等于10了。此时的a也等于10
         *
         *  -8  + 10 = 2
         */
        int b = -a++ + ++a;
        System.out.println("b的值:" + b  +   "  a的值是:" + a);

        int c = 8;
        //c = c + 4;
        //c+=4;
        int d =  c += 4;
        System.out.println(d);

        int e = 8;
        e *= 9;   //跟 e= e * 9 等价
        System.out.println(e);   //得到72
    }
}
