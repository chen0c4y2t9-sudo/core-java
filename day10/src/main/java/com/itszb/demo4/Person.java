package com.itszb.demo4;

public class Person {
    String id;
    String name;

    public Person(){}

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode方法被执行了.....");
        return this.name.hashCode() + this.id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals方法被调用了....");
        if(obj instanceof Person person){
            return this.id.equals(person.id) && this.name.equals(person.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
