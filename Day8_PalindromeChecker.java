import java.util.Scanner;

public class Day8_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int reversed = 0;
        while(num != 0) 
        {
            int digit = num % 10;
            reversed  = reversed * 10 + digit;
            num/=10;
        }
        if(n == reversed)
        {
            System.out.print("Yes,it is palindrome.");
        }
        else 
        {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }
}
