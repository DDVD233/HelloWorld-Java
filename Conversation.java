
/**
 * Write a description of class Conversation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Conversation
{
    public static void main(String[] args) {
        String name;
        String name2;
        int age;
        int gradeLevel;
        String homeworkDesc;
        String ILChoice;
        String bestProgrammingLanguage;
        
        int age2;
        int gradeLevel2;
        String homeworkDesc2;
        String ILChoice2;
        String bestProgrammingLanguage2;
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
        
        System.out.println("Enter your name");
        name2 = scan.next();
        
        System.out.println("Enter your age");
        age2 = scan.nextInt();
        
        System.out.println("Enter your grade level");
        gradeLevel2 = scan.nextInt();
        
        System.out.println("How much homework do you have?");
        homeworkDesc2 = scan.next();
        
        System.out.println("Enter your IL choice");
        ILChoice2 = scan.next();
        
        System.out.println("What's the best programming language?");
        bestProgrammingLanguage2 = scan.next();
        
        System.out.println("Here is a crazy person called " + name + ". ");
        System.out.println("He meets another crazy man called " + name2 + ". ");
        System.out.println(name + " is " + age + 
                           ", but " + name2 + " is " + age2 + ". ");
        
        System.out.println(name + ": Hey man! I am in " + gradeLevel + "th grade. ");
        System.out.println(name2+" : Yo! I am in "+gradeLevel2+"th grade. ");
        
    }
}
