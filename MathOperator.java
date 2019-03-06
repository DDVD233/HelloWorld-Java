
/**
 * Write a description of class MathOperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MathOperator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        double number = scanner.nextDouble();
        
        System.out.println("Absolute value: " + Math.abs(number));
        System.out.println("Square root: " + Math.sqrt(number));
        
        System.out.println("Enter your first number");
        double x = scanner.nextDouble();
        System.out.println("Enter your second number");
        double y = scanner.nextDouble();
        
        System.out.println(x + "^" + y + " = " + Math.pow(x,y));
        
        System.out.println("Enter your number for trig functions");
        double trig = scanner.nextDouble();
        double sin = Math.sin(trig);
        
        // Just for fun
        /*
        int accuracy = 10;
        double taylorSin = 0;
        for (int n=0; n<=accuracy; n++) {
            double increment = Math.pow(-1,n)/factorial(2*n+1)*Math.pow(x,2*n+1);
            taylorSin += increment;
        }
        
        double taylorCos = 0;
        for (int n=0; n<=accuracy; n++) {
            double increment = Math.pow(-1,n)/factorial(2*n)*Math.pow(x,2*n);
            taylorCos += increment;
        }
        */
        double tan = Math.tan(trig);
        double cos = Math.cos(trig);
        System.out.println("Sin: " + sin);
        //System.out.println("Taylor Sin: " + taylorSin);
        System.out.println("Cos: " + cos);
        //System.out.println("Taylor Cos: " + taylorCos);
        System.out.println("Tan: " + tan);
    }
    
    static int factorial(int n) { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    }
}
