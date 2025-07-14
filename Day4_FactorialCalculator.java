import java.util.Scanner;

public class Day4_FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact=1;
        
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.print(fact);
        sc.close();
    }
}
