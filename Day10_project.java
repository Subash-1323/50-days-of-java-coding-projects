import java.util.*;

class Student
{
    String name;
    int[] marks;

    Student(int[] marks,String name)
    {
        this.name = name;
        this.marks = marks;
    }

    int Totalmarks()
    {
        int total = 0;
        for(int num:marks)
        {
            total += num;
        }
        return total;
    }

    double average()
    {
        return Totalmarks() / (double) marks.length;
    }

    char Gradetable()
    {
        double avg = average();
        if( avg >=90 ) return 'O';
        else if( avg >= 80) return 'A';
        else if( avg >= 70) return 'B';
        else if( avg >= 60) return 'C';
        else return 'F';
    }

    void displayResult()
    {
        System.out.println("=== Student Result ===");
        System.out.println("Name : " + name);
        System.out.println("Total mark : " + Totalmarks());
        System.out.println("Average : " + average());
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Subject " + (i + 1) + ":" + marks[i]);
        }
        System.out.println("Grade : " + Gradetable());
    }
}

public class Day10_project{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        for(int i = 0;i<marks.length; i++)
        {
            System.out.println("Enter the mark "+ (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
        Student s = new Student(marks, name);
        s.displayResult();

        sc.close();
    }
}
