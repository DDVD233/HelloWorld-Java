
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StudentList
{    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name");
        String name = scanner.next();
        
        System.out.println("What is your student ID number");
        int studentID = scanner.nextInt();
        
        System.out.println("What is your grade");
        int grade = scanner.nextInt();
        
        System.out.println("What is your GPA");
        double GPA = scanner.nextDouble();
        
        boolean isChris = false;
        System.out.println("Are you Chris? (y for yes)");
        if (scanner.next().equalsIgnoreCase("y")) {
            isChris = true;
        } else if (name.contains("hris")) {
            System.out.println("That's a lie!");
            isChris = true;
        }
        
        Student aStudent = new Student(name, grade, studentID, GPA, isChris);
        System.out.println(aStudent.getName() + " is in " + aStudent.getGrade() + " grade" );
        System.out.println("His/her student ID number is " + aStudent.getStudentID());
        System.out.println("His/her GPA is " + aStudent.getGpa());
        System.out.println("His/her is a " + aStudent.gradeName() + ".");
        System.out.println("He/she is " + (aStudent.getIsChris()?"":"not ") + "Chris");
    }
}
