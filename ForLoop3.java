
/**
 * Write a description of class ForLoop3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ForLoop3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i=50;i>=1;i--) {
            System.out.println(i);
        }
        
        for (int i=50;i>=1;i-=5) {
            System.out.println(i);
        }
        
        System.out.println("How many students in the class?");
        int numStu = scanner.nextInt();
        String name = "";
        int sibN = 0;
        int petN = 0;
        String birthP = "";
        for (int i=1; i<=numStu; i++) {
            System.out.println(i + ": What is your name?");
            name = scanner.next();
            
            System.out.println(i + ": How many siblings do you have?");
            sibN = scanner.nextInt();
            
            System.out.println(i + ": How many pets do you have?");
            petN = scanner.nextInt();
        
            System.out.println(i + ": Where were you born?");
            birthP = scanner.next();
            
            System.out.println(name + "is born in " + birthP + 
                                ", has " + sibN + " sibling(s)" + 
                                " and " + petN + "pet(s)");
        }
        
        
        for (int i=1; i<70; i++) {
            int spMaximum = 50-i;
            for (int j=0; j<spMaximum; j++) {
                System.out.print(" ");
            }
            
            for (int j=0; j<i*2; j++) {
                if (j%(i%7+1)<1) {
                    System.out.print("+");
                } else if (j%2 == 1) {
                    System.out.print(".");
                } else {
                    System.out.print("`");
                }
            }
            
            System.out.println("");
        }
        
        double total = 0;
        System.out.println("How many people are there?");
        int maxPpl = scanner.nextInt();
        for (int j=0;j<maxPpl;j++) {
            System.out.println("What is your name?");
            name = scanner.next();
            
            System.out.println(name + ", how much money did you spend for lunch?");
            double lunchM = scanner.nextDouble();
            
            total += lunchM;
        }
        
        double average = total/maxPpl;
        System.out.println(maxPpl + " people spend a average amount of $" + 
                           average + " money.");
    }
}
