package homework.test3;

public class Dept {
    private String deptName;
    private Employee manager;

    public Dept() {}

    public Dept(String deptName, Employee manager) {
        this.deptName = deptName;
        this.manager = manager;
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }
    public Employee getManager() { return manager; }
    public void setManager(Employee manager) { this.manager = manager; }
}
