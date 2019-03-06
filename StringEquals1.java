
/**
 * Write a description of class StringEquals1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class StringEquals1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first name");
        String name1 = scanner.next();
        System.out.println("Enter Second name");
        String name2 = scanner.next();
        
        System.out.println(name1.equals(name2)?"Names are the same": "Names are different");
        System.out.println(name1.substring(0,1).equals(name2.substring(0,1))?"Initials are the same":"Initials are differernt");
        System.out.println(name1.equalsIgnoreCase(name2)?"Names are the same(Case insensitive)": "Names are different(Case insensitive)");
        System.out.println((name1.compareTo(name2)<0?name1:name2) + " is the first name.");
        
        String name1Last = name1.substring(name1.indexOf("_")+1);
        String name2Last = name2.substring(name2.indexOf("_")+1);
        System.out.println((name1Last.compareTo(name2Last)<0?name1Last:name2Last) + " is the first last_name.");
        
    }
}
