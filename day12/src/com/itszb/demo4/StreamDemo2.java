package com.itszb.demo4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 创建Stream流
 *   方式1： 基于集合对象创建Stream流对象  集合对象.stream()
 *   方式2: 根据数组对象创建Stream流对象   Arrays.stream(数组对象)
 *   方式3： Stream.of(T.... values);
 */
public class StreamDemo2 {

    // 演示Stream流的3种创建方式
    @Test
    public void test01() {
        List<String> names = new ArrayList<>();
        names.add("王晓红");
        names.add("王平");
        names.add("张三");
        names.add("王思聪");
        names.add("李四");
        // 方式1：基于集合对象创建Stream流
        Stream<String> stream = names.stream();

        // 方式2：根据数组对象创建Stream流
        int[] arr = {11,13,15,17,19};
        IntStream stream1 = Arrays.stream(arr);

        // 方式3：使用Stream.of方法创建Stream流
        Stream<String> stream2 = Stream.of("oscar", "curry", "eric", "kobe", "james");
    }


    /**
     * 演示Stream流的中间操作 -- 筛选与切片
     *   filter(Predicate predicate) 对指定集合中的元素进行过滤
     *   limit(long num) 取出集合中前面几个元素
     *   skip(long num) 跳过前面指定个数的元素
     *   distinct() 对集合中的元素进行去重操作，如果是对象类型的元素，对象所属的类必须实现equals方法和hashCode方法
     */

    @Test
    public void test02(){
        List<Employee> list = EmployeeData.getEmployees();
        // 根据集合对象创建Stream流对象
        Stream<Employee> stream = list.stream();
        // 需求：找出集合中薪资大于4000的员工信息
        stream.filter(s->s.getSalary() > 4000).forEach(System.out::println);
        System.out.println("-----------------");
        // 集合中所有元素的输出
        list.stream().forEach(System.out::println);
        System.out.println("-----------------");
        // 输出集合中前三个元素
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("-----------------");
        // 跳过指定个数的元素
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("-----------------");
        // 添加一些重复的元素，然后进行去重操作
        list.add(new Employee(1002,"james",22,3210));
        list.add(new Employee(1002,"james",22,3210));
        list.add(new Employee(1002,"james",22,3210));
        list.add(new Employee(1001,"eric",21,2100));
        list.add(new Employee(1001,"eric",21,2100));
        list.add(new Employee(1001,"eric",21,2100));
        // 输出去重之前的元素
        list.stream().forEach(System.out::println);
        System.out.println("--------去重之后的集合---------");
        // 进行去重操作  如果我们是对集合中的对象数据进行去重，对象所属的类必须重写equals方法和hashCode方法
        list.stream().distinct().forEach(System.out::println);
    }

    /**
     * Stream流的中间操作 --  映射
     * map(Function mapper)
     */
    @Test
    public void test03(){
        List<String> list = Arrays.asList("aa","bb","cc","dd","ee","ff");
        // 转大写的map映射
        list.stream().map(s ->s.toUpperCase()).forEach(System.out::println);
        System.out.println("------------------");
        // 将员工集合中名字长度超过5的名字输出
        EmployeeData.getEmployees().stream().map(s->s.getName()).filter(s ->s.length() > 5).forEach(System.out::println);
    }

    /**
     * Stream流的中间操作 -- 排序
     *  Stream sorted() 给自然元素进行排序
     *  Stream sorted(Comparator com) 指定比较规则，再进行排序
     */
    @Test
    public void test04(){
        List<Integer> list = Arrays.asList(99,12,34,32,67,56,78,90,55,43);
        // 对自然元素进行排序
        list.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------");
        // 对员工的年龄进行排序
        EmployeeData.getEmployees().stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).forEach(System.out::println);
        System.out.println("--------------------");
        // 先使用年龄进行排序，如果年龄一样，再按照薪资进行排序
        EmployeeData.getEmployees().stream().sorted((e1,e2)->{
            int value = Integer.compare(e1.getAge(), e2.getAge());
            if(value !=0){
                return value;
            }else{
                return Integer.compare(e1.getSalary(),e2.getSalary());
            }
        }).forEach(System.out::println);
    }
}
