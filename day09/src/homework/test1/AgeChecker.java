package homework.test1;

public class AgeChecker {
    /**
     * 检查年龄是否合法
     * @param age 年龄
     * @throws AgeIllegalException 当年龄小于0或大于150时抛出
     */
    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 0 || age > 150) {
            throw new AgeIllegalException("年龄不能小于0或大于150，当前输入：" + age);
        }
        System.out.println("年龄合法，当前年龄：" + age);
    }
}