package com.itszb.demo1;

public class Student {
    private String username;
    public Integer age;
    public String address;

    public Student(){}

    public Student(String username, Integer age, String address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
