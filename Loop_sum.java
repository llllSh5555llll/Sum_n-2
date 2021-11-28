public class Loop_sum {
    public static void main(String[] argv) {
      
        int i;
        int j;
        int x;
        int sum=0;
        for (i = 1 ; i <= 100; i++) {
            j=i*i;
            System.out.println(j);
            for (x=1;x <= 100; x++) {
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}

