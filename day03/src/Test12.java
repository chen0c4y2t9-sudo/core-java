public class Test12 {
    public static void main(String[] args) {
        int days = 0;
        for(int i = 2000;i<2026;i++){
            if(i % 4 ==0 && i % 100 !=0 || i % 400 ==0){
                days =days + 366;
            }
            else {
                days = days + 365;  // 平年加365
            }
        }
        System.out.println(days);
    }
}