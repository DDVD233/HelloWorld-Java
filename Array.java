
/**
 * Write a description of class ClassArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4;
        String[] name = new String[n];
        int[] age = new int[n];
        int[] grade = new int[n];
        
        for (int i=0; i<4; i++) {
            System.out.println("Please enter name " + i + ":");
            name[i] = scan.next();
        }
        
        for (int i=0; i<4; i++) {
            System.out.println("How old is " + name[i] + "?");
            age[i] = scan.nextInt();
        }
        
        for (int i=0; i<4; i++) {
            System.out.println("Which grade is " + name[i] + " in?");
            grade[i] = scan.nextInt();
        }
        
        for (int i=0; i<4; i++) {
            System.out.println(name[i] + " is " + age[i] + " years old and in grade " + grade[i] + ".");
        }
    }
}
