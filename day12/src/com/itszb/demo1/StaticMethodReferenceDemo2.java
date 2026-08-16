package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class StaticMethodReferenceDemo2 {

    @Test
    public void test01(){
        Function<Double,Long> func = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Long apply = func.apply(3.1415926);
        System.out.println(apply);
    }

    @Test
    public void test02(){
        Function<Double,Long> func = num->Math.round(num);
        Long apply = func.apply(5.1415926);
        System.out.println(apply);
    }

    @Test
    public void  test03(){
        Function<Double,Long> func = Math::round;
        Long apply = func.apply(5.9415926);
        System.out.println(apply);
    }
}
