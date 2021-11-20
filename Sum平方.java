import java.util.Scanner;

public class Sum平方 {
    public static void main(String[] argv) {

        int n;
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(n) and you will get sum of powers :'1 to n' ");
        n=scanner.nextInt();

        z=(n*(n+1)*(2*n+1)/6);

        System.out.println("the anser is : "+z);

        scanner.close();

    }
}
