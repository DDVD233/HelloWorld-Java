
/**
 * Write a description of class IntroString3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class IntroString3 {
    public  static void main(String[] agrgs){
       Scanner scan=new Scanner(System.in);
       String firstName="";
       String lastName="";
       
       System.out.println("Enter your first name");
       firstName = scan.next();
        
       System.out.println("Enter your lastname");
       lastName = scan.next();
        
       System.out.print(firstName + " " + lastName + " has " + firstName.length() + " letters in his first name");
       System.out.println(" and " + lastName.length() + " letters in his last name");
    }
}
