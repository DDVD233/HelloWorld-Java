import java.util.*;
import java.io.*;
//import java.util.ArrayList;

public class studentsMain
{
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        String answer = "no";

        ArrayList<Students> studentList = new ArrayList<Students>();

        while (answer.equalsIgnoreCase("no"))
        {
            System.out.println("Please enter a student's name:");
            String name = scan.next();

            System.out.println("Please enter a student's age:");
            int age = scan.nextInt();
            
            System.out.println("Please enter a student's grade:");
            int grade = scan.nextInt();
            
            System.out.println("Please enter a student's GPA:");
            double gpa = scan.nextDouble();

            studentList.add(new Students(name, age, gpa, grade));

            System.out.println("Are you done:");
            answer = scan.next();
        }
        
        System.out.println("***** Favorite MFS Students *****");
        for (int i=0; i<studentList.size(); i++)
        {
            System.out.println("        " + studentList.get(i).getName() + " " + studentList.get(i).getAge()
            + " GPA: " + studentList.get(i).getGpa() + " Grade: " + studentList.get(i).getGrade());
        }

        
    }
}

//Scanner
