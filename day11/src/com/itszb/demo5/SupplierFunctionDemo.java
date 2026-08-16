package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

/**
 * 供给型函数式接口的使用
 *  T get() 不传递任何参数，方法的返回值类型必须是函数式接口中定义的泛型的数据类型
 */
public class SupplierFunctionDemo {

    // 定义一个方法返回6为数字长度的验证码
    public String generateValidateCode(Supplier<String> supplier){
        return supplier.get();
    }

    @Test
    public void test01(){
        String validateCode = generateValidateCode(new Supplier<String>() {
            @Override
            public String get() {
                return "897651";
            }
        });
        System.out.println("返回的验证码是:" + validateCode);
    }

    @Test
    public void test02(){
        String validateCode = generateValidateCode(() -> "237930");
        System.out.println("验证码是:" + validateCode);
    }
}
