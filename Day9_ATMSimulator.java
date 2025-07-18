import java.util.Scanner;

public class Day9_ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.00;
        int choice;
        
        do
        {
            System.out.println("\n=== ATM simulator ===");
            System.out.println("1.view balance.");
            System.out.println("2.Money deposit.");
            System.out.println("3.Withdraw money.");
            System.out.println("4.exit.");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("current balance: ₹"+balance);
                    break;
                
                case 2:
                    System.out.println("Enter the amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if(deposit > 0)
                    {
                        balance+=deposit;
                        System.out.println("₹" + deposit + "Deposited successfully.");
                        System.out.println("Current balance: ₹" + balance);
                    }
                    else
                    {
                        System.out.println("Invalid amount.");
                    }
                    break;
                
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if(withdraw > 0 && withdraw <= balance)
                    {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + "withdrawn successfully.");
                    }
                    else
                    {
                        System.out.println("Invalid amount or insufficient fund.");

                    }
                    break;
                case 4:
                    System.out.println("Thank you for visiting our ATM. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid option.try again");
                    break;
            }
        }while(choice != 4);

        sc.close();
    }
}
