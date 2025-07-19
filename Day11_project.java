import java.util.*;

class Subash {
    int number;

    Subash(int number) {
        this.number = number;
    }

    boolean isPalindrome() {
        int num = number;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed == number;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("Yes, " + number + " is a palindrome number.");
        } else {
            System.out.println("No, " + number + " is not a palindrome number.");
        }
    }
}

public class Day11_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        Subash s = new Subash(number);
        s.displayResult();

        sc.close();
    }
}
