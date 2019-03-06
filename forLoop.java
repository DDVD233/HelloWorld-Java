
/**
 * Write a description of class forLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class forLoop
{
    
    public static void main(String[] args){
        String name=new String(" ");
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("What is your name?");
        name=scanner.next();
        
        String firstName = name.substring(0,(name.indexOf("_")));
        String firstInitial = firstName.substring(0,1);
        String lastName = name.substring(name.indexOf("_")+1);
        String lastInitial = lastName.substring(0,1);
        
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Initials: " + firstInitial + lastInitial);
        System.out.println("FI + Last Name: " + firstInitial + " " + lastName);
        System.out.println("First Name + LI: " + firstName + " " + lastInitial);
        
    }
}
