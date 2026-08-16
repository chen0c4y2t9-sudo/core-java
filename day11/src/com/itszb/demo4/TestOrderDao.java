package com.itszb.demo4;

public class TestOrderDao {
    static void main() {
        /**
         *  如果在lambda表达式中，参数有且只有1个，函数体有且只有1行代码，前面的() 或者方法体{}都是可以省略掉的，甚至return关键字都可以省略
         */
       /* OrderDao orderDao = (amount)->{
            return amount * 10;
        };*/

        OrderDao orderDao = amount-> amount * 10;


        int price = orderDao.getPrice(10);
        System.out.println(price);
    }
}
