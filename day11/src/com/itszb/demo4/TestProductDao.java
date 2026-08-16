package com.itszb.demo4;

/**
 * Lambda表达式的使用总结：
 *  1. 使用lambda表达式的前提是：必须存在函数式接口。只能对函数式接口中的方法进行实现，要求接口中只能有1个抽象方法
 *  2. 在定义lambda表达式的时候，定义参数的时候，参数列表中的参数类型可以省略，因为编译器可以自行推断参数的类型
 *  3. 如果参数列表中的参数只有1个，那么圆括号也是可以省略的。
 *  4. 如果lambda表达式中的函数体有且只有1行代码，那么花括号也是可以省略的。
 *  5. 如果lambda表达式的函数体中的代码只有1行，代码中使用的return关键字也是可以省略的。
 */
public class TestProductDao {
    static void main() {
        ProductDao productDao = (a,b)-> a + b;
        int num = productDao.getNum(23, 23);
        System.out.println(num);
    }
}
