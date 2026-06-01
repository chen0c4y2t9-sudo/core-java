public class Test8 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=100){
            //6题
            /**
             * sum+=i;
             * i++;
             */
            //7题
            if(i%2!=0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
