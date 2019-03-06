
/**
 * It was initially a lunch menu. But now it's a RPG!
 *
 * @author David Dai
 * @version 10/15/2018
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class LunchMenu
{
    static String name = "";
    static double accountBalance = 0.0;
    static int hunger = 30;
    static int thirst = 30;
    static int sanity = 70;
    static int day = 1;
    public static void main(String[] args) throws InterruptedException {
        accountBalance = 50.0;
        startBuying();
    }

    static void startBuying() throws InterruptedException {
        System.out.println("--------------Welcome!---------------");
        displayMenu();
        saveName();
        int nSan = buySandwich();
        int nDrink = buyDrinks();
        int nDessert = buyDessert();

        double totalPrice = roundToTenth(5.99*nSan + 3.99*nDrink + 7.99*nDessert);
        System.out.println("You ordered " + nSan + " sandwich(es) (Hunger -" + nSan*30 + "）");
        System.out.println("            " + nDrink + " drink(s) (Thirst -" + nDrink*10 + "）");
        System.out.println("            " + nDessert + " dessert(s) (Sanity +" + nDessert*20 + "）");
        System.out.println("The total price is " + totalPrice + " dollars.");

        if (totalPrice>accountBalance) {
            System.out.println("You don't have enough money in your account!");
            System.out.println("Please try again!");
            startBuying();
        } else {
            if (totalPrice>0) {
                accountBalance -= totalPrice;
                System.out.printf("Your new balance: %.2f dollars.", accountBalance);
                System.out.println("");
                System.out.println("Thank you for your order! Your food will be ready in 3s.");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Your food is ready. Enjoy!");
                hunger -= nSan * 30;
                thirst -= nDrink * 20;
                sanity += nDessert * 20;
                TimeUnit.SECONDS.sleep(1);
                
                double foodQuality = Math.random();
                if (foodQuality < 0.333333333) {
                    System.out.println("The food sucks. (Sanity -5)");
                    sanity -= 5;
                } else if (foodQuality > 0.666666666) {
                    System.out.println("The food is delicious. (Sanity +5)");
                    sanity += 5;
                }
            }

            for (int i=0; i<5; i++) {
                System.out.println("...");
                System.out.println("...");
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println("It's the next day!");
            day++;
            TimeUnit.SECONDS.sleep(1);

            randomChanging();
            
            if (deathCheck()) {
                System.out.println("That's the only thing you remembered.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Game Over.");
            } else {
                startBuying();
            }
        }
    }

    // Changes money/sanity/hunger/thirst at the beginning of each day
    static void randomChanging() throws InterruptedException {
        int incHunger = (int) (30 + Math.random()*10);
        System.out.println("Your hunger was increased by " + incHunger);
        hunger += incHunger;
        TimeUnit.SECONDS.sleep(1);

        int incThirst = (int) (30 + Math.random()*10);
        System.out.println("Your thirst was increased by " + incThirst);
        thirst += incThirst;
        TimeUnit.SECONDS.sleep(1);
        
        int changeSanity = (int) (Math.random()*5);
        int delSanity = 0;
        if (changeSanity == 0) {
            delSanity = -40;
            System.out.println("You did a bad job on your Computer Science test! (Sanity -40)");
        } else if (changeSanity == 1) {
            delSanity = 20;
            System.out.println("You did a great job on your Computer Science test! (Sanity +20)");
        } else if (changeSanity == 2) {
            delSanity = 20;
            System.out.println("You feel great today. (Sanity +20)");
        } else if (changeSanity == 3) {
            delSanity = -20;
            System.out.println("You feel awful today. (Sanity -20)");
        } else if (changeSanity == 4) {
            delSanity = -30;
            System.out.println("You were hit by a football. (Sanity -30)");
        }
        
        sanity += delSanity;

        double received = 4 + Math.random()*23;
        TimeUnit.SECONDS.sleep(1);
        System.out.printf("You received %.2f dollars.", received);
        System.out.println("");
        accountBalance += received;
        TimeUnit.SECONDS.sleep(1);
    }

    static void displayMenu() {
        System.out.println("              Lunch Menu");
        System.out.println("1. Sandwich (-30 Hunger)--------------------- $5.99/ea");
        System.out.println("2. Drink (cup) (-20 Thirst)------------------ $3.99/ea");
        System.out.println("3. Dessert of the day (+20 Sanity)----------- $7.99/ea");
        System.out.println("------------------------------------------------------");
    }

    static void saveName() throws InterruptedException {
        if (name.equals("")) {
            System.out.println("What's your name?");
            Scanner scanner = new Scanner(System.in);
            name = scanner.next();
        }
        System.out.printf("You have %.02f dollars in your account.", accountBalance);
        System.out.println("");
        
        System.out.print("Your sanity is " + sanity);
        if (sanity < 30) {
            System.out.println(" (Warning!)");
        } else {
            System.out.println("");
        }
        TimeUnit.SECONDS.sleep(1);
        
        System.out.print("Your hunger is " + hunger);
        if (hunger > 60) {
            System.out.println(" (Warning!)");
        } else {
            System.out.println("");
        }
        TimeUnit.SECONDS.sleep(1);
        
        System.out.print("Your thrist is " + thirst);
        if (thirst > 60) {
            System.out.println(" (Warning!)");
        } else {
            System.out.println("");
        }
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("Day " + day);
        TimeUnit.SECONDS.sleep(1);
    }

    static int buySandwich() {
        System.out.println("How many sandwiches do you want?");
        Scanner scanner = new Scanner(System.in);
        String nSan = scanner.next();
        try {
            int nSanInt = Integer.parseInt(nSan);
            if (nSanInt>3) {
                System.out.println("Sorry, you can only buy 3 sandwiches. Please try again.");
            } else {
                return nSanInt;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Please try again.");
        }

        int retryNSandwich = buySandwich();
        return retryNSandwich;
    }

    static int buyDrinks() {
        System.out.println("How many drinks do you want?");
        Scanner scanner = new Scanner(System.in);
        String nDrk = scanner.next();

        try {
            int nDrkInt = Integer.parseInt(nDrk);
            if (nDrkInt>5) {
                System.out.println("Sorry, you can only buy 5 drinks. Please try again.");
            } else {
                return nDrkInt;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Please try again.");
        }

        int retryNDrinks = buyDrinks();
        return retryNDrinks;
    }

    static int buyDessert() {
        System.out.println("How many desserts do you want?");
        Scanner scanner = new Scanner(System.in);
        String nDst = scanner.next();
        try {
            int nDstInt = Integer.parseInt(nDst);
            if (nDstInt>3) {
                System.out.println("Sorry, you can only buy 3 desserts. Please try again.");
            } else {
                return nDstInt;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Please try again.");
        }

        int retryNDessert = buyDessert();
        return retryNDessert;
    }

    static double roundToTenth(double n) {
        return 0.01 * Math.round(n*100);
    }
    
    static boolean deathCheck() throws InterruptedException {
        if (hunger > 100) {
            System.out.println("You felt so hungry.");
            TimeUnit.SECONDS.sleep(1);
            return true;
        } else if (thirst > 100) {
            System.out.println("You felt so thirsty.");
            TimeUnit.SECONDS.sleep(1);
            return true;
        } else if (sanity < 0) {
            System.out.println("You were so sad.");
            TimeUnit.SECONDS.sleep(1);
            return true;
        } 
        return false;
    }
}
