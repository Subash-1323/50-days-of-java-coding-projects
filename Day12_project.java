import java.util.Scanner;

class Fibonacci {
    int end;

    Fibonacci(int end) {
        this.end = end;
    }

    void displaySeries() {
        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci series up to " + end + " terms:");
        for (int i = 0; i < end; i++) {
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        System.out.println();
    }
}

public class Day12_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int end = sc.nextInt();

        Fibonacci fib = new Fibonacci(end);
        fib.displaySeries();

        sc.close();
    }
}
