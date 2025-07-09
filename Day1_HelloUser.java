import java.util.Scanner;
public class Day1_HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Day 1 of Java Projects 🚀");
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Nice to meet you, " + name + "! Let's build 50 Java projects together!");
        sc.close();
    }
}
