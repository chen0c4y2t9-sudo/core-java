package homework.test1;

public class ArrayOperation {
    public static void main(String[] args) {

        double[] scores = {85.5, 92.0, 78.5, 88.5, 96.0};

        double sum = 0;
        System.out.println("---- 学生成绩统计 ----");
        System.out.print("所有成绩: ");
        for (double score : scores) {
            System.out.print(score + " ");
            sum += score;
        }
        System.out.println();

        double average = sum / scores.length;
        System.out.printf("平均分: %.2f%n", average);


        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.println("最低分: " + min);


        int count = 0;
        for (double score : scores) {
            if (score >= average) {
                count++;
            }
        }
        System.out.println("大于等于平均分的成绩个数: " + count);
    }
}