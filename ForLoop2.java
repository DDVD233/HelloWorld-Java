
/**
 * The for loop program
 *
 * @author David Dai
 * @version 10/1/2018
 */
import java.util.Scanner;
public class ForLoop2 {
    public static void main(String[] args) {
        String myName = "David Dai";
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<5;i++) {
            System.out.println(myName);
        }

        String name = "";
        int age = 0;
        int grade = 0;
        for (int j=0;j<5;j++) {
            System.out.println("Enter your name");
            name = scanner.next();
            
            System.out.println("Enter your age");
            age = scanner.nextInt();
            
            System.out.println("Enter your grade");
            grade = scanner.nextInt();
            
            System.out.println(name + " is " + age + " and is in " + grade + "th grade.");
        }
        
        for (int k=0;k<100;k++) {
            System.out.println("Enter your name");
            name = scanner.next();
            
            String nInitial = name.substring(0, 1);
            String pLName = name + nInitial + "ay";
            
            System.out.println(name);
        }
        
        for (int l=101;l<200;l+=2) {
            System.out.println(l);
        }
        
        for (int m=1150;m<301;m+=3) {
            System.out.println(m);
        }
        
        int number = 0;
        for (int k=0;k<3;k++) {
            System.out.println("Enter your number");
            number = scanner.nextInt();
            
            System.out.println(number*5);
        }
        
        int x = 0;
        int y=0;
        for (int k=0;k<5;k++) {
            System.out.println("Enter your first number");
            x = scanner.nextInt();
            
            System.out.println("Enter your second number");
            y = scanner.nextInt();
            
            System.out.println(x*y);
        }
    }
}
