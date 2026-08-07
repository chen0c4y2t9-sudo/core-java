package homework.test2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("请输入生日（格式：yyyy-MM-dd）：");
        String birthdayStr = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        LocalDate birthday = LocalDate.parse(birthdayStr, formatter);
        LocalDate today = LocalDate.now();

        System.out.println("\n---- 生日信息分析 ----");
        System.out.println("今天日期：" + today.format(formatter));
        System.out.println("生日日期：" + birthday.format(formatter));

        int birthMonth = birthday.getMonthValue();
        int birthDay = birthday.getDayOfMonth();
        LocalDate thisYearBirthday = LocalDate.of(today.getYear(), birthMonth, birthDay);

        boolean isBirthdayPassed = thisYearBirthday.isBefore(today) || thisYearBirthday.isEqual(today);
        if (isBirthdayPassed) {
            System.out.println("今年是否已过生日：是（已过或今天是生日）");
        } else {
            System.out.println("今年是否已过生日：否（还未到生日）");
        }

        long daysUntilNextBirthday;
        if (isBirthdayPassed) {

            LocalDate nextYearBirthday = thisYearBirthday.plusYears(1);
            daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextYearBirthday);
            System.out.println("下一次生日日期：" + nextYearBirthday.format(formatter));
        } else {

            daysUntilNextBirthday = ChronoUnit.DAYS.between(today, thisYearBirthday);
            System.out.println("下一次生日日期：" + thisYearBirthday.format(formatter));
        }
        System.out.println("距离下一次生日还有：" + daysUntilNextBirthday + "天");

        scanner.close();
    }
}