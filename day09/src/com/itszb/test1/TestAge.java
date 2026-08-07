package com.itszb.test1;

public class TestAge {
    static void main() {
        try{
            checkAge(23);
        }catch (AgeIllegalException ex){
            System.out.println("异常信息是:" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // 描述年龄的方法
    public static void checkAge(int age) throws AgeIllegalException{
        if(age < 0 || age > 150){
            throw new AgeIllegalException("年龄不能小于0或者大于150");
        }
        System.out.println("年龄合法");
    }
}
