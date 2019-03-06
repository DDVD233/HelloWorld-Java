
/**
 * Write a description of class NameArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NameArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4;
        String[] name = {"Chris", "David", "Mia", "Will", "Will", "Ethan", "Michel", "Jack", "Oscar"};
        
        int count = 0;
        for (int i=0; i<name.length; i++) {
            if (name[i].length() <= 4) {
                count++;
            }
        }
        
        System.out.println(count + " people have a name with 4 characters or less.");
        
        System.out.println("Enter a letter: ");
        String letter = scan.next().substring(0,1);
        count = 0;
        for (int i=0; i<name.length; i++) {
            if (name[i].substring(0,1).equalsIgnoreCase(letter)) {
                System.out.println(name[i]);
                count++;
            }
        }
        System.out.println(count + " people have a name that begins with " + letter + ".");
        
        count = 0;
        for (int i=0; i<name.length; i++) {
            int letterCount = name[i].length();
            System.out.println(name[i] + " has " + letterCount + " letters.");
            count += letterCount;
        }
        double average = (double) count / name.length;
        System.out.println("People have " + average + " letters on average.");
         
        for (int i=0; i<name.length; i++) {
            for (int j=name[i].length()-1; j>=0; j--) {
                System.out.print(name[i].substring(j, j+1));
            }
            
            System.out.println("");
        }
    }
}
