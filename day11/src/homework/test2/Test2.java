package homework.test2;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {

        TreeMap<Employee, String> map = new TreeMap<>(new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e2.getSalary() - e1.getSalary();
            }
        });

        map.put(new Employee(1, "张三", 8000), "技术部");
        map.put(new Employee(2, "李四", 12000), "财务部");
        map.put(new Employee(3, "王五", 6000), "人事部");
        map.put(new Employee(4, "赵六", 15000), "技术部");


        System.out.println("工资最高：" + map.firstEntry().getKey() + " 部门：" + map.firstEntry().getValue());
        System.out.println("工资最低：" + map.lastEntry().getKey() + " 部门：" + map.lastEntry().getValue());


        System.out.println("所有员工信息：");
        for (Employee e : map.keySet()) {
            System.out.println(e + " 部门：" + map.get(e));
        }
    }
}
