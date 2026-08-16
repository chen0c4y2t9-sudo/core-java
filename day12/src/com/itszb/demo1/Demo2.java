package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class Demo2 {

    @Test
    public void test01(){
        Employee emp = new Employee(1001,"eric",22,10000);
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return emp.getName();
            }
        };

        System.out.println(supplier.get());
    }

    @Test
    public void test02(){
        Employee emp = new Employee(1001,"eric",22,10000);
        Supplier<String> supplier = ()->emp.getName();
        System.out.println(supplier.get());
    }

    @Test
    public void test03(){
        Employee emp = new Employee(1001,"eric",22,10000);
        Supplier<String> supplier = emp::getName;
        System.out.println(supplier.get());
    }
}
