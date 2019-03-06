
/**
 * Write a description of class Palindromes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Palindromes
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scanner.next();
        
        int length = sentence.length();
        String reversed = "";
        for (int i=length-1; i>=0; i--) {
            reversed += sentence.substring(i, i+1);
        }
        
        System.out.println("Reversed: " + reversed);
    }
}
