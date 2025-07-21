import java.util.Scanner;

class InterestCalculator {
    private double principal;
    private double rate;
    private double time;

    public InterestCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest(int n) {
        return principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;
    }

    public double getTotalAmount(double interest) {
        return principal + interest;
    }
}

public class Day13_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Interest Calculator (OOP) ---");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter Principal amount: ");
                double principal = sc.nextDouble();

                System.out.print("Enter Rate of Interest (%): ");
                double rate = sc.nextDouble();

                System.out.print("Enter Time (in years): ");
                double time = sc.nextDouble();

                InterestCalculator calc = new InterestCalculator(principal, rate, time);

                if (choice == 1) {
                    double si = calc.calculateSimpleInterest();
                    System.out.printf("\nSimple Interest: %.2f\n", si);
                    System.out.printf("Total Amount   : %.2f\n", calc.getTotalAmount(si));
                } else {
                    System.out.print("Enter number of times interest is compounded per year: ");
                    int n = sc.nextInt();
                    double ci = calc.calculateCompoundInterest(n);
                    System.out.printf("\nCompound Interest: %.2f\n", ci);
                    System.out.printf("Total Amount     : %.2f\n", calc.getTotalAmount(ci));
                }
            } else if (choice != 3) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        System.out.println("Thank you for using the Interest Calculator!");
        sc.close();
    }
}
