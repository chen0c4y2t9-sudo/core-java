package homework.test3;

public class Employee {
    private String EmployeeName;
    private Integer age;

    public Employee() {}

    public Employee(String EmployeeName, Integer age) {
        this.EmployeeName = EmployeeName;
        this.age = age;
    }

    public String getEmployeeName() { return EmployeeName; }
    public void setEmployeeName(String EmployeeName) { this.EmployeeName = EmployeeName; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}
