package com.itszb.demo1;

public class Employee {
    private String cardId;
    private String name;

    public Employee(){}

    public Employee(String cardId, String name) {
        this.cardId = cardId;
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee employee){
            return this.cardId.equals(employee.cardId) && this.name.equals(employee.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
