import java.util.Scanner;

public class Day6_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("How many fibonacci series to generate:");
        int n = sc.nextInt();
        long num1 = 0,num2 = 1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(" "+ num1);
            long num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        sc.close();
    }
}
