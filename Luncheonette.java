
/**
 * Write a description of class Luncheonette here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Luncheonette
{
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        double total = 0;
        total += orderDrink();
        total += orderPizza();
        total += orderSandwich();
        
        System.out.println("Total: $" + total);
        System.out.println("Enjoy your food!");
    }
    
    private static void welcome() {
        System.out.println("Welcome! Choose what you want");
        System.out.println();
        System.out.println();
    }
    
    private static double orderDrink() {
        System.out.println("All drink costs $1.25 each.");
        System.out.println("How many drink do you want?");
        int quantity = scanner.nextInt();
        if (quantity>=0) {
            return calcPrice(quantity);
        } else {
            System.out.println("Quantity cannot be smaller than 0!");
            return orderDrink();
        }
    }
    
    private static double orderPizza() {
        System.out.println("Plain Pizza: $1.5 each");
        
        System.out.println("Pepperoni Pizza: $2.00 each");
        System.out.println("How many pepperoni pizza do you want?");
        int pepperoniQuantity = scanner.nextInt();
        System.out.println("How many plain pizza do you want?");
        int plainQuantity = scanner.nextInt();
        if (pepperoniQuantity>=0 && plainQuantity>=0) {
            double subtotal = calcPrice(plainQuantity, "plain");
            subtotal += calcPrice(pepperoniQuantity, "pepperoni");
            return subtotal;
        } else {
            System.out.println("Quantity cannot be smaller than 0!");
            return orderPizza();
        }
    }
    
    private static double orderSandwich() {
        double price = 2.00;
        System.out.println("Sandwich: $2.00");
        System.out.println("Full: +$0.5");
        System.out.println("Hot: +$0.5");
        
        System.out.println("How many sandwiches do you want?");
        int quantity = scanner.nextInt();
        if (quantity>0) {
            System.out.println("Do you want it to be full size?(yes/no)");
            if (answerIsPositive()) {
                price += 0.5;
            }
            
            System.out.println("Do you want it hot?(yes/no)");
            if (answerIsPositive()) {
                price += 0.5;
            }
            
            return calcPrice(quantity, price);
        } else if (quantity==0) {
            return 0;
        } else {
            System.out.println("Quantity cannot be smaller than 0!");
            return orderSandwich();
        }
    }
    
    private static boolean answerIsPositive() {
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
            return true;
        } else if (answer.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println(answer + " is not an option. Please try again!");
            return answerIsPositive();
        }
    }
    
    private static double calcPrice(int quantity, double price) {
        return quantity * price;
    }
    
    private static double calcPrice(int quantity) {
        return 1.25 * quantity;
    }
    
    private static double calcPrice(int quantity, String type) {
        if (type.equals("plain")) {
            return 1.5*quantity;
        } else if (type.equals("pepperoni")) {
            return 2.0*quantity;
        }
        
        return 0;
    }
}
