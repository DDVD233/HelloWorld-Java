
/**
 * Thanks for coming to TGI Fridays!
 * preconditions:
 * We serve cheeseburgers, ribs, and caesar salad.
 * The user has to enter his/her name, and the number of different things they want to order.
 * And the end of your purchase, we will show the total price that you have to pay, and the tax you have to pay.
 */

public class Fridays
{
    private int numberCheeseburger;
    private int numberRibs;
    private int numberCaesarSalad;
    private String name;
    private double price;
    private int calories;
    private double tax;
    private static String restaurantName = "TGI Fridays";

    public Fridays(int numberCheeseburger, int numberRibs, int numberCaesarSalad, String name){
        this.numberCheeseburger = numberCheeseburger;
        this.numberRibs = numberRibs;
        this.numberCaesarSalad = numberCaesarSalad;
        this.name = name;
    }
    
    public Fridays(String name){
        this.name = name;
        numberCheeseburger = 1;
        numberRibs = 1;
        numberCaesarSalad = 1;
    }
    
    public Fridays(){
        numberCheeseburger = 0;
        numberRibs = 0;
        numberCaesarSalad = 0;
        name = " ";
    }
    
    public String getName(){
        return name;
    }

    public int getNumberCheeseburger(){
        return numberCheeseburger;
    }

    public int getNumberRibs(){
        return numberRibs;
    }
    
    public int getNumberCaesarSalad(){
        return numberCaesarSalad;
    }
    
    public double getPrice(){
        return price;
    }

    public int getCalories(){
        return calories;
    }

    public double getTax(){
        return tax;
    }

    public static String GetRestaurantName(){
        return restaurantName;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setNumberCheeseburger(int numberCheeseburger){
        this.numberCheeseburger = numberCheeseburger;
    }
    
    public void setNumberRibs(int numberRibs){
        this.numberRibs = numberRibs;
    }
    
    public void setNumberCaesarSalad(int numberCaesarSalad){
        this.numberCaesarSalad = numberCaesarSalad;
    }

    public void setPrice(double dollar){
        this.price = price;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void setTax(double tax){
        this.tax = tax;
    }

    public static void setRestaurantName(String TGIFridays){
        restaurantName = TGIFridays;
    }
    
    public double calcPrice(){
        price = numberCheeseburger * 11.29 + numberRibs * 21.99 + numberCaesarSalad * 4.99;
        return price;
    }
    
    public String toString(){
        return "Welcome to TGI Fridays! \nPlease look at the menu before deciding what you want to buy!";
    }

}