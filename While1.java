
/**
 * Write a description of class While1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class While1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        String lunch = "";
        String name = "";
        while (i<10) {
            System.out.println("What's you name?");
            name = scanner.next();
            System.out.println("What do you want for lunch?");
            lunch = scanner.next();
            System.out.println(name + " had " + lunch + " for lunch");
            i++;
        }
        
        int j = 10;
        while (j>=1) {
            System.out.println(j);
            j--;
        }
    }
}
