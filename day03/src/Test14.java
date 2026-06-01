public class Test14 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("所有的水仙花数有：");
        for (int num = 100; num <= 999; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == num) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("水仙花数一共有 " + count + " 个");
    }
}
