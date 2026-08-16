package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionTest {

    public List<Student> filterStudent(List<Student> list, Predicate<Student> pre){
        ArrayList<Student> new_list = new ArrayList<>();
        for(Student student : list){
            if(pre.test(student)){
                new_list.add(student);
            }
        }
        return new_list;
    }

    @Test
    public void test01(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("eric",90));
        list.add(new Student("james",32));
        list.add(new Student("lily",59));
        list.add(new Student("sunny",85));
        List<Student> studentList = filterStudent(list, s -> s.getScore() >= 80);
        System.out.println("新的集合是:" + studentList);
    }
}
