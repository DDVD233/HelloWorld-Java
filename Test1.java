
/**
 * Write a description of class Test1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Test1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        
        System.out.println("Hi " + name + ", please enter a number");
        int x = scanner.nextInt();
        System.out.println("And another number");
        int y = scanner.nextInt();
        
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println("The remainder of " + x + " / " + y + " = " + (x%y));
        
        System.out.println("So " + name + ", how far do you drive to school (in miles)");
        double distance = Double.valueOf(scanner.next());
        
        System.out.println("So " + name + ", what’s the average speed of your trip to school (in miles/hour)");
        double speed = Double.valueOf(scanner.next());
        System.out.println("So " + name + ", how long do you usually have to wait at traffic lights (in minutes)");
        double waitTime = Double.valueOf(scanner.next());
        System.out.println("So " + name + ", how long did you wait on that breakfast line (0 for none)");
        double waitBreakfastTime = Double.valueOf(scanner.next());
        
        double totalTime = distance/speed*60 + waitTime + waitBreakfastTime;
        System.out.println(name + ", it took you " + totalTime + " minutes to get to school today.");
        System.out.println("");
        System.out.println("");
    }
}
