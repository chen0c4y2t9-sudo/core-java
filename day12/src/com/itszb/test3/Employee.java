package com.itszb.test3;

public class Employee {
    private String empName;
    public Integer age;

    public Employee(){}

    public Employee(String empName, Integer age) {
        this.empName = empName;
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }
}
