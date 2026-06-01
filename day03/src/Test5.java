import java.util.Scanner;

public class Test5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入季度（1-4）：");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("第一季度：3－5月（春季）");
                break;
            case 2:
                System.out.println("第二季度：6－8月（夏季）");
                break;
            case 3:
                System.out.println("第三季度：9－11月（秋季）");
                break;
            case 4:
                System.out.println("第四季度：12－2月（冬季）");
                break;
            default:
                System.out.println("输入错误！请输入1-4之间的数字");
                break;
        }
    }
}
