package com.itszb.test3;

public class Dept {
    private String deptName;
    public Employee manager;

    public Dept(){}

    public Dept(String deptName, Employee manager) {
        this.deptName = deptName;
        this.manager = manager;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", manager=" + manager +
                '}';
    }
}
