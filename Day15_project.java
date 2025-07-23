import java.util.*;

class StringReverser {
    private String original;

    public StringReverser(String original) {
        this.original = original;
    }

    public String reverse() {
        StringBuilder reversed = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        return reversed.toString();
    }

    public void displayResult() {
        System.out.println("\n--- String Reversal ---");
        System.out.println("Original : " + original);
        System.out.println("Reversed : " + reverse());
    }
}

public class Day15_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringReverser reverser = new StringReverser(input);
        reverser.displayResult();

        sc.close();
    }
}
