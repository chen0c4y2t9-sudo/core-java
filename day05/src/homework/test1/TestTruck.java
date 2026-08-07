package homework.test1;

import java.util.Scanner;

public class TestTruck {
    public static void main(String[] args) {

        Truck truck = new Truck("京D1111", "东风", "蓝色", 20.0, 500);


        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入租车人姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入租赁天数：");
        int days = scanner.nextInt();


        truck.rent(name, days);

        scanner.close();
    }
}
