package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * 消费性函数式接口的使用
 *
 * void accept(T t) 接收传递的参数，但是不返回任何类型的数据
 */
public class ConsumerFunctionDemo {

    public void getResult(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    @Test
    public void test01(){
        getResult(8.8, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("当前余额是:" + aDouble);
            }
        });
    }

    @Test
    public void test02(){
        getResult(8.9,(money)->{
            System.out.println("当前金额是:" + money);
        });
    }
}
