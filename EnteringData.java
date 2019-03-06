
/**
 * Write a description of class EnteringData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class EnteringData
{
    public static void main(String[] args) {
        String name;
        int age;
        int gradeLevel;
        String homeworkDesc;
        String ILChoice;
        String bestProgrammingLanguage;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name");
        name = scan.next();
        
        System.out.println("Enter your age");
        age = scan.nextInt();
        
        System.out.println("Enter your grade level");
        gradeLevel = scan.nextInt();
        
        System.out.println("How much homework do you have?");
        homeworkDesc = scan.next();
        
        System.out.println("Enter your IL choice");
        ILChoice = scan.next();
        
        System.out.println("What's the best programming language?");
        bestProgrammingLanguage = scan.next();
        
        System.out.println("Here is a crazy person called " + name + ". ");
        System.out.println("You are " + age + ". ");
        System.out.println("You are in " + gradeLevel + "th grade. ");
        System.out.println("You have " + homeworkDesc + " homework. ");
        System.out.println("Your IL choice is " + ILChoice + " . ");
        System.out.println("You think the best programming language is python.");
    }
}
