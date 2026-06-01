/**
 * 演示整型数据类型的使用：
 *    byte 8个比特位，1个字节
 *    short 16个比特位，2字节
 *    int 32个比特位，4字节
 *    long 64个比特位，8字节
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
         *  byte e = 10;   这里的10默认是int类型的。虽然是int类型，但是该值在byte类型的范围之内，所以int类型的值会直接转换成了byte类型。
         *  */
        byte e = 10;
        short a = 10;
        System.out.println(a);
        // byte b = 200; // 会报错，因为byte的数据类型取值是-128 - 127 之间。
        int b = a;// 将一个short类型的变量赋予给byte类型的变量（将小整型的变量赋给给大整型的变量，这种称为隐式类型转换）
        System.out.println(b);

        int c = 100;
        // short d = c; // 将大整形的变量赋给小整型的变量，会报错

        // long d = 92233720368547758; // 这样写会报错，默认整数是int类型，但是int类型的区间范围装不下这么大的值，如果想要接收这个值，需要在后面加上L
        long d = 92233720368547758L; // 在后面加上L，标识是一个long类型的整数。

        System.out.println(0xA);// 0x是16进制的表示法，A代表的是10进制中的10
        System.out.println(012); // 0是8进制中的表示法，012代表的是10进制中的10


        int k = 2147483647;
        k =  k + 1;
        System.out.println(k);
    }

}
