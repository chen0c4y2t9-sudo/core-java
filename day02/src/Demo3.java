public class Demo3 {
    public static void main(String[] args) {
        double a=10.5,b=66;
        // float f = 9.99; 会报错，因为默认的小数是double类型的，赋予给小范围的float。如果想要解决这个问题，在小数值的后面加上f。
        // 这个F标识数据类型是float的。
        // 不管是float 还是double都涉及到数据精度的问题，如果涉及到金钱方面的数额，为了保证数据的精度，一般不会使用double/float数据类型来描述，
        // 后续会使用一个BigDecimal来描述前的余额，因为精度会更高。
        float f = 9.99F;
        double g = f;
        System.out.println(g);

        long l = 21731371236768L;
        float m = l;   //这里能编译通过吗？ 不会报错，但是会丢失精度，一般我们也不会这么干
        System.out.println(m);
    }
}
