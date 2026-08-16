package homework.test1;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "张三", 85.5));
        list.add(new Student(2, "李四", 92.0));
        list.add(new Student(1, "张老三", 78.0));
        list.add(new Student(3, "王五", 95.5));
        list.add(new Student(2, "李老四", 66.0));

        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean exists = false;
            for (int j = 0; j < newList.size(); j++) {
                if (list.get(i).id == newList.get(j).id) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                newList.add(list.get(i));
            }
        }

        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = 0; j < newList.size() - 1 - i; j++) {
                if (newList.get(j).score < newList.get(j + 1).score) {
                    Student temp = newList.get(j);
                    newList.set(j, newList.get(j + 1));
                    newList.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.println("id:" + newList.get(i).id + " 姓名:" + newList.get(i).name + " 分数:" + newList.get(i).score);
        }
    }
}