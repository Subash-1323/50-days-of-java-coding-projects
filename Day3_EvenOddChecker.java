import java.util.*;
class EvenOddChecker{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = a%2 == 0?"Even" : "Odd";
        System.out.println(result);
        sc.close();
    }
}