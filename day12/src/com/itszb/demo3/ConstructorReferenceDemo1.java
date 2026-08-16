package com.itszb.demo3;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceDemo1 {

    @Test
    public void test01(){
        Supplier<Employee> supplier = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        Employee employee = supplier.get();
        System.out.println(employee);
    }

    @Test
    public void test02(){
        Supplier<Employee> supplier = ()->new Employee();
        System.out.println(supplier.get());
    }

    @Test
    public void test03(){
        Supplier<Employee> supplier = Employee::new;
        System.out.println(supplier.get());
    }

    @Test
    public void test04(){
       /* Function<Integer,Employee> func = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return new Employee(integer,"eric",13,2000);
            }
        };

        Employee employee = func.apply(1005);
        System.out.println(employee);*/


       /* Function<Integer,Employee> func = id->new Employee(id,"monkey",25,2000);
        Employee employee = func.apply(1006);
        System.out.println(employee);*/

        Function<Integer,Employee> func = Employee::new;
        Employee employee = func.apply(1006);
        System.out.println(employee);
    }

    @Test
    public void test05(){
      /*  BiFunction<String,Integer,Employee> biFunction = new BiFunction<String, Integer, Employee>() {
            @Override
            public Employee apply(String string, Integer integer) {
                return new Employee(string,integer);
            }
        };*/

        // BiFunction<String,Integer,Employee> biFunction = (name,money) ->new Employee(name,money);

         BiFunction<String,Integer,Employee> biFunction = Employee::new;
        Employee employee = biFunction.apply("admin", 2000);
        System.out.println(employee);
    }
}
