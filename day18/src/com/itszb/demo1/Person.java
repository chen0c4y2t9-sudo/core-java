package com.itszb.demo1;

public class Person {
    private String username;
    private Integer age;

    public Person() {}

    public Person(String username){
        this.username = username;
    }

    private Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("这是一个showInfo方法");
    }

    public int getSum(int a,int b){
        return a + b;
    }

    private String getMessage(String message){
        return message;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
