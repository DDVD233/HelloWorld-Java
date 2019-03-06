
import java.util.Scanner;
public class LunchMain
{
    public static void main()
    {
        Scanner scan= new Scanner(System.in);

        while (true) {
            System.out.println("********************************");
            System.out.println("*         Akira                *");
            System.out.println("*         Fridays              *");
            System.out.println("*         BuffaloWildWings     *");
            System.out.println("********************************");
            System.out.println("Which of these fine lunch venues interest you today?\n");
            String name = scan.next();
            switch(name.toUpperCase())
            {
                case "FRIDAYS":
                System.out.println("You chose Fridays");
                orderFromFridays();
                break;
                case "BUFFALOWILDWINGS":
                System.out.println("You chose Buffalo Wild Wings");
                orderFromBuffaloWildWings();
                break;
                case "AKIRA":
                System.out.println("You chose Akira");
                orderFromAkira();
            }   
        }
    }
    
    /**
     * Worst code I have ever written!
     */
    static void orderFromBuffaloWildWings() {
        BuffaloWildWings bww;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BuffaloWildWings!");
        
        System.out.println("How many wings do you want?");
        int numWings = scanner.nextInt();
        if (numWings != 0) {
            System.out.println("Which flavor do you want? (hot or mild)");
            String flavor = scanner.next();
            System.out.println("How many drinks do you want?");
            int numDrinks = scanner.nextInt();
            if (numDrinks != 0) {
                System.out.println("Which size do you want? (small or large)");
                String dSize = scanner.next();
                bww = new BuffaloWildWings(flavor, numWings, numDrinks, dSize);
            } else {
                bww = new BuffaloWildWings(flavor, numWings);
            }
        } else {
            System.out.println("How many drinks do you want?");
            int numDrinks = scanner.nextInt();
            if (numDrinks != 0) {
                System.out.println("Which size do you want? (small or large)");
                String dSize = scanner.next();
                bww = new BuffaloWildWings(numDrinks, dSize);
            } else {
                System.out.println("You cannot order nothing!");
                return;
            }
        }
        
        System.out.println("Your Total Price: " + bww.calcPrice());
    }
    
    static void orderFromFridays() {
        Fridays fridays;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fridays!");
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Do you want a default combo w/ 1 cheeseburger, 1 salad and 1 rib? (y for yes)");
        if (scanner.next().equalsIgnoreCase("y")) {
            fridays = new Fridays(name);
        } else {
            System.out.println("How many cheeseburgers do you want?");
            int numCheeseburgers = scanner.nextInt();
            
            System.out.println("How many ribs do you want?");
            int numRibs = scanner.nextInt();
            
            System.out.println("How many salad do you want?");
            int numSalad = scanner.nextInt();
            
            fridays = new Fridays(numCheeseburgers, numRibs, numSalad, name);
        }
        
        System.out.println("Your Total Price: " + fridays.calcPrice());
    }
    
    static void orderFromAkira() {
        Scanner scanner = new Scanner(System.in);
        Akira akira = new Akira();
        akira.setToM("L");
        System.out.println("Do you want a special combo?(y for yes)");
        if (scanner.next().equalsIgnoreCase("y")) {
            akira.setSpecialCombo(true);
        }
        
        System.out.println("What kind of Tempura do you want? (n for none)");
        System.out.println("* Because of our limited supplied material, we only provide 1 each meal. Sorry!");
        System.out.println("* Enter Pi for PinkLady");
        System.out.println("* Enter Ro for Rock");
        System.out.println("* Enter Sh for Shrimp");
        System.out.println("* Enter Sh for Shrimp");
        System.out.println("* Enter Ca for Califonia");
        System.out.println("* Enter St for Spicy Tuna");
        System.out.println("* Enter Sa for Salmon");
        akira.setToT(scanner.next());
        
        System.out.println("What kind of Roll do you want? (n for none)");
        System.out.println("* Because of our limited supplied material, we only provide 1 each meal. Sorry!");
        System.out.println("* Enter Pi for PinkLady");
        System.out.println("* Enter Ro for Rock");
        System.out.println("* Enter Sh for Shrimp");
        System.out.println("* Enter Ca for Califonia");
        System.out.println("* Enter St for Spicy Tuna");
        System.out.println("* Enter Sa for Salmon");
        akira.setToR(scanner.next());
        double totalPrice = akira.calcPrice();
        
        System.out.println("Your total price: " + totalPrice);
        
    }
}
