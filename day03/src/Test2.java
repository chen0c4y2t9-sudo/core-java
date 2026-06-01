import java.util.Scanner;

/**
 * 题目：计算销售总金额图书批发商店的某本书的零售价是26.5元/本，如果客户一次性购买100本以上（包括100本），
 * 则每本的价格打9折，如果客户一次性购买500本以上（包 括500本），则每本的价格打8折并返回1000元给客户，
 * 请分别计算购买8本、150本、600本的应付金额是多少。要求购买书的数量从控制台输入。
 */
public class Test2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入购买书的数量：");
        int num= sc.nextInt();
        double price=num*26.5;
        if(num>=500){
            System.out.println("应付金额为"+(price*0.8-1000));
        }
        else if(num>=100){
            System.out.println("应付金额为"+(price*0.9));
        }
        else{
            System.out.println("应付金额为"+price);
        }


    }
}
