package homework.test3;

import java.util.Optional;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("场景1：" + getManagerName(null));

        Dept dept2 = new Dept("技术部", null);
        System.out.println("场景2：" + getManagerName(dept2));

        Employee emp3 = new Employee(null, 25);
        Dept dept3 = new Dept("财务部", emp3);
        System.out.println("场景3：" + getManagerName(dept3));

        Employee emp4 = new Employee("王经理", 30);
        Dept dept4 = new Dept("人事部", emp4);
        System.out.println("场景4：" + getManagerName(dept4));
    }

    public static String getManagerName(Dept dept) {
        return Optional.ofNullable(dept)
                .map(Dept::getManager)
                .map(Employee::getEmployeeName)
                .orElse("默认部门");
    }
}