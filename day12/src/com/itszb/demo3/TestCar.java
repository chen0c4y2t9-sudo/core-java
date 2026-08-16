package com.itszb.demo3;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestCar {

    @Test
    public void test01(){
        CarDao carDao = new CarDao() {
            @Override
            public Car getCar(String name, String brand, double price) {
                return new Car(name,brand,price);
            }
        };
    }

    @Test
    public void test02(){
        CarDao carDao = (name,brand,price)-> new Car(name,brand,price);
        Car car = carDao.getCar("BMW530", "宝马", 500000);
        System.out.println(car);
    }

    @Test
    public void test03(){
        CarDao carDao = Car::new;
        Car car = carDao.getCar("BMW540LI", "宝马", 500000);
        System.out.println(car);
    }

    @Test
    public void test04(){
        /*BiFunction<String,Integer,Employee> biFunction = new BiFunction<String, Integer, Employee>() {
            @Override
            public Employee apply(String string, Integer integer) {
                return new Employee(integer,"pig",12,5000);
            }
        };*/

        // Function<Integer,Employee> function = (id) ->new Employee(id,"eric",2,2000);

        Function<Integer,Employee> func = Employee::new;
    }
}
