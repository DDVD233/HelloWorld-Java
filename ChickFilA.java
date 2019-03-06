
/**
 * Thanks for using ChickFilA Order Class.
 * PreCondition:
 * Initialize using one of the three constructors.
 * Menu:
 * Spicy Chicken Sandwich: 3.99 each
 * Chicken Nuggets       : 2.99 each
 * Drinks                : 1.99 each
 * Use the default constructor if the client does not have any account. It will order the default combo automatically.
 * Use the second  constructor if the client have a account and want to order the default combo. See the comment below for detail.
 * Use the third   constructor for custom order. 
 * Use mutators to modify the order. 
 * Mutators: See comments below.
 * Accessors: See comments below.
 * Post Condition: 
 * Use Method calcPrice() to get the total price (tax included);
 * Use Method calcTax()   to get the total Tax;
 *
 * @author David D
 * @version 12/10/18
 */
public class ChickFilA
{
    // instance variables - replace the example below with your own
    private String name;
    private double balance;
    private int numSpicyChicken;
    private int numDrinks;
    private int numChickenNuggets;
    private static String restaurantName = "Chick-Fil-A";

    /**
     * Use this Constructor to order the default combo.
     */
    public ChickFilA()
    {
        name = "NA";
        numSpicyChicken = 1;
        numDrinks = 1;
        numChickenNuggets = 1;
        balance = 50.0;
    }
    
    /**
     * Use this Constructor to use a previous account and order the default combo.
     * @param     int Number of Chicken Nuggets
     * @return    
     */
    public ChickFilA(String name, double balance) {
        this.name = name;
        this.balance = balance;
        name = "NA";
        numSpicyChicken = 1;
        numDrinks = 1;
        numChickenNuggets = 1;
    }

    public ChickFilA(String name, double balance, int numSpicyChicken, int numDrinks,int numChickenNuggets) {
        this.name = name;
        this.balance = balance;
        this.numSpicyChicken = numSpicyChicken;
        this.numDrinks = numDrinks;
        this.numChickenNuggets = numChickenNuggets;
    }

    /**
     * Use this method to modify the number of Spicy Chicken Sandwith the client ordered.
     * @param     int Number of SCS
     * @return    
     */
    public void setNumSpicyChicken(int numSpicyChicken) {
        this.numSpicyChicken = numSpicyChicken;
    }
    
    /**
     * Use this method to modify the number of drinks the client ordered.
     * @param     int Number of drinks
     * @return    
     */
    public void setNumDrinks(int numDrinks) {
        this.numDrinks = numDrinks;
    }
    
    /**
     * Use this method to modify the number of Chicken Nuggets the client ordered.
     * @param     int Number of Chicken Nuggets
     * @return    
     */
    public void setNumChickenNuggets(int numChickenNuggets) {
        this.numChickenNuggets = numChickenNuggets;
    }
    
    /**
     * Use this method to modify the balance in client's account.
     * Warning: Call this method only when you receives money from clients.
     * Warning: The parameter is the new balance. NOT the amount of money to be added
     * @param     double New Balance
     * @return    
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * Use this method to modify the client's name.
     * @param     String Name
     * @return    
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Use this method to get client's name.
     * @param     
     * @return    String Name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Use this method to get client's name.
     * @param     
     * @return    double Balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Use this method to get the numeber of Spicy Chicken the client ordered.
     * @param     
     * @return    int numSpicyChicken
     */
    public int getNumSpicyChicken() {
        return numSpicyChicken;
    }
    
    /**
     * Use this method to get the numeber of Spicy Chicken the client ordered.
     * @param     
     * @return    int numDrinks
     */
    public int getNumDrinks() {
        return numDrinks;
    }
    
    /**
     * Use this method to get the numeber of ChickenNuggets the client ordered.
     * @param     
     * @return    int numChickenNuggets
     */
    public int getNumChickenNuggets() {
        return numChickenNuggets;
    }
    
    private double getTotalPrice() {
        return 3.99 * numSpicyChicken + 2.99 * numChickenNuggets + 1.99 * numDrinks;
    }
    
    public static void setRestaurantName(String aRestaurantName) {
        restaurantName = aRestaurantName;
    }
    
    public static String getRestaurantName() {
        return restaurantName;
    }
    
    public double calcTax() {
        return getTotalPrice() * 0.07;
    }
    
    public double calcPrice() {
        return getTotalPrice() * 1.07;
    }
    
    public String toString() {
        return "Welcome to Chick-Fil-A";
    }
}
