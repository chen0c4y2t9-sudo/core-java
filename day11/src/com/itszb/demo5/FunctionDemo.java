package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

/**
 * R apply(T t); 传递的参数为t，返回的参数为R
 */
public class FunctionDemo {

    // 输入一个字符串，获取字符串的长度
    public Integer getLength(String message, Function<String,Integer> func){
        return func.apply(message);
    }

    // 输入一个分数，判断成绩等级
    public String getResult(int score,Function<Integer,String> func){
        return func.apply(score);
    }

    @Test
    public void test01(){
        Integer length = getLength("hello,java", new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        });
        System.out.println("字符串的长度是：" + length);
    }

    @Test
    public void test02(){
        Integer length = getLength("hello,java", s -> s.length());
        System.out.println(length);
    }

    @Test
    public void test03(){
        String result = getResult(80, new Function<Integer, String>() {
            @Override
            public String apply(Integer score) {
                if(score >=90){
                    return "优秀";
                } else if (score >= 80) {
                    return "良好";
                } else if (score >=60) {
                    return "及格";
                }else {
                    return "不及格";
                }
            }
        });
        System.out.println("成绩的结果是:" + result);
    }

    @Test
    public void test04(){
        String result = getResult(80, (score)->{
            if(score >=90){
                return "优秀";
            } else if (score >= 80) {
                return "良好";
            } else if (score >=60) {
                return "及格";
            }else {
                return "不及格";
            }
        });
        System.out.println("成绩的结果是:" + result);
    }

    /**
     * 函数式接口还可以作为方法的返回值
     */

    public Function<Integer,String> getMethod(){
        return new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "hello" + integer;
            }
        };
    }

    public Function<Integer,String> getMethod2(){
        return (a)->"hello" + a;
    }
}
