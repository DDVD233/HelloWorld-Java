
/**
 * Write a description of class initials3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class initials3
{
   public  static void main(String[] agrgs){
       Scanner scan=new Scanner(System.in);
       String firstname="";
       String lastname="";
       
        System.out.println("Enter your first name");
        firstname = scan.next();
        
        System.out.println("Enter your lastname");
        lastname = scan.next();
        
        System.out.println("Your name is "+firstname+" "+lastname);
        System.out.println("Your name's initial is " +firstname.substring(0,1) + lastname.substring(0,1));
        System.out.println("Your first name has "+ firstname.length()+" characters");
        System.out.println("Your last name has "+ lastname.length()+" characters");
        
        
        
    }
}
