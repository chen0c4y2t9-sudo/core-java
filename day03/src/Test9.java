import java.util.Scanner;

public class Test9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：(<10)");
        int n = sc.nextInt();
        if (n < 0 || n >= 10) {
            System.out.println("输入不合法，请输入 0~9 之间的整数。");
        } else {
            int result = 1;   // 保存阶乘结果，从1开始累乘

            for (int i = 1; i < n; i++) {
                result *= i;
            }
            System.out.println(result);

        }
    }

}
