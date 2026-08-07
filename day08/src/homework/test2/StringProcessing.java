
package homework.test2;
import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("请输入18位身份证号: ");
        String idCard = scanner.nextLine();


        if (idCard.length() != 18) {
            System.out.println("身份证号长度不正确，请确保为18位！");
            return;
        }

        System.out.println("\n---- 身份证信息处理 ----");


        String birthday = idCard.substring(6, 14);
        String year = birthday.substring(0, 4);
        String month = birthday.substring(4, 6);
        String day = birthday.substring(6, 8);
        System.out.println("出生日期: " + year + "年" + month + "月" + day + "日");


        char firstChar = idCard.charAt(0);
        boolean isValidStart = firstChar >= '1' && firstChar <= '9';
        System.out.println("是否以数字1-9开头: " + (isValidStart ? "是" : "否"));


        StringBuilder sb = new StringBuilder(idCard);
        String reversed = sb.reverse().toString();
        System.out.println("身份证号反转: " + reversed);

        scanner.close();
    }
}