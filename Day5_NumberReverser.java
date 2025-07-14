import java.util.Scanner;

public class Day5_NumberReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long reversed = 0;
        while(a!=0)
        {
            long digit = a%10;
            reversed = reversed*10 +digit;
            a/=10;
        }
        System.out.println(reversed);
        sc.close();
    }
}
