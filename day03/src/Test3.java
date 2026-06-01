import java.util.Scanner;

/**
 * 题目：读入一个表示年份的整数，判断是否是闰年。
 *
 * 如何判断一个年份 是否是闰年：
 *
 * 如果这个年份能够被4 整除，且不能被100 整除，则这一年是闰年。例如，1996 年是闰年，而相应的，1993 年就不是闰年。
 *
 * 如果这个年份能够被100 整除，则这个数必须要能被400 整除，才是闰年。例如，2000 年是闰年，1900 年不是闰年。
 */
public class Test3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=sc.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println("是闰年");
            }
            else{
                System.out.println("不是闰年");
            }
        }else{
            if(year%4==0){
                System.out.println("是闰年");
            }
            else{
                System.out.println("不是闰年");
            }
        }


    }
}
