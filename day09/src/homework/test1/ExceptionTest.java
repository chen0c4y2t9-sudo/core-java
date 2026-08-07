package homework.test1;

public class ExceptionTest {
    public static void main(String[] args) {
        // 测试合法年龄
        System.out.println("---- 测试合法年龄 ----");
        try {
            AgeChecker.checkAge(25);
        } catch (AgeIllegalException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }

        // 测试不合法年龄（负数）
        System.out.println("\n---- 测试不合法年龄（负数）----");
        try {
            AgeChecker.checkAge(-5);
        } catch (AgeIllegalException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }

        // 测试不合法年龄（超过150）
        System.out.println("\n---- 测试不合法年龄（超过150）----");
        try {
            AgeChecker.checkAge(200);
        } catch (AgeIllegalException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }
    }
}