
/**
 *Welcome to Akira!
 *There's many kinds of rolls, tempuras and other choices available.
 *Highly recommend the "Pink Lady roll" and the "Shrimp Tempura".
 *Lunch Special Combo for only $9.95 (From 12:00 to 15:00), $15.95 for dinner(17:00 to 22:00).
 *Please enter the Roll type you want (PinkLady-$14.95, Rock-$12.95, Shrimp-$13.95, California-$8.95, Spicy Tuna-$16.95, Salmon-$18.95.)
 *Please enter the Tempura type you want (Shrimp-$19.95, vege-$11.95, fish-$17.95, clam-$15.95.)
 *Auther-Chris Gu
 */
public class Akira
{
    private String TypeOfRoll;
    private double PriceOfRoll;
    private String TypeOfTempura;
    private double PriceOfTempura;
    private boolean SpecialCombo;
    private String TimeOfMeal;
    private double PriceOfComno;

    private static String NameOfRestaurant ="Akira";
    
    public static void main(String[] args) {
        System.out.println("Welcome to Akira!");
        System.out.println("There's many kinds of rolls, tempuras and other choices available.");
        System.out.println("Highly recommend the Pink Lady roll and the Shrimp Tempura");
        System.out.println("Lunch Special Combo for only $9.95 (From 12:00 to 15:00), $15.95 for dinner(17:00 to 22:00).");
        System.out.println("Please enter the Roll type you want (PinkLady-$14.95, Rock-$12.95, Shrimp-$13.95, California-$8.95, Spicy Tuna-$16.95, Salmon-$18.95.");
        System.out.println("Please enter the Tempura type you want (Shrimp-$19.95, vege-$11.95, fish-$17.95, clam-$15.95.)");
    }
    
    public Akira() {
        TypeOfRoll="";
        TypeOfTempura="";
        SpecialCombo=false;
        TimeOfMeal="";
    }

    public Akira(String TypeOfRoll) {
        this.TypeOfRoll=TypeOfRoll;
        TypeOfTempura="";
        SpecialCombo=false;
        TimeOfMeal="";
    }

    public Akira(String TypeOfRoll, String TypeOfTempura) {
        this.TypeOfRoll=TypeOfRoll;
        this.TypeOfTempura=TypeOfTempura;
        SpecialCombo=false;
        TimeOfMeal="";
    }

    /**
     * Because of our limited supplied material, we only provide 1 each meal. Sorry!
     * Enter Pi for PinkLady
     * Enter Ro for Rock
     * Enter Sh for Shrimp
     * Enter Ca for Califonia
     * Enter St for Spicy Tuna
     * Enter Sa for Salmon
     */
    public String getTypeOfRoll() {
        return TypeOfRoll;
    }

    public double getPriceOfRoll() {
        if (TypeOfRoll.equalsIgnoreCase("Pi")) {
            return 14.95;
        }else if (TypeOfRoll.equalsIgnoreCase("Ro")) {
            return 12.95;
        }else if (TypeOfRoll.equalsIgnoreCase("Sh")) {
            return 13.95;
        }else if (TypeOfRoll.equalsIgnoreCase("Ca")) {
            return 8.95;
        }else if (TypeOfRoll.equalsIgnoreCase("St")) {
            return 16.95;
        }else if (TypeOfRoll.equalsIgnoreCase("Sa")) {
            return 18.95;
        }else {
            return 0.0;
        }
    }

    /**
     * Because of our limited supplied material, we only provide 1 each meal. Sorry!
     * Enter Sh for Shrimp.
     * Enter Ve for Vege.
     * Enter Fi for fish.
     * Enter Cl for clam.
     */
    public String getTypeOfTempura() {
        return TypeOfTempura;
    }

    public double getPriceOfTempura() {
        if (TypeOfTempura.equalsIgnoreCase("Sh")) {
            return 19.95;
        }else if (TypeOfTempura.equalsIgnoreCase("Ve")) {
            return 11.95;
        }else if (TypeOfTempura.equalsIgnoreCase("Fi")) {
            return 17.95;
        }else if (TypeOfTempura.equalsIgnoreCase("Cl")) {
            return 15.95;
        }else {
            return 0.0;
        }
    }
    
    public boolean getSpecialCombo() {
        return SpecialCombo;
    }

    public String getTimeOfMeal() {
        return TimeOfMeal;
    }

    public static String getNameOfRestaurant() {
        return NameOfRestaurant;
    }
    
    public void setTypeOfRoll(String TypeOfRoll){
        this.TypeOfRoll=TypeOfRoll;
    }
    
    public void setPriceOfRoll(double PriceOfRoll){
        this.PriceOfRoll=PriceOfRoll;
    }
    
    public void setTypeOfTempura(String TypeOfTempura){
        this.TypeOfTempura=TypeOfTempura;
    }
    
    public void setPriceOfTempura(double PriceOfTempura){
        this.PriceOfTempura=PriceOfTempura;
    }

    public void setSpecialCombo(boolean SpecialCombo){
        this.SpecialCombo=SpecialCombo;
    }

    public void setTimeOfMeal(String TimeOfMeal){
        this.TimeOfMeal=TimeOfMeal;
    }

    public static void setNoR(String Akira){
        NameOfRestaurant=Akira;
    }

    public double getPoS() {
        if (!SpecialCombo) {
            return 0.0;
        }else if (SpecialCombo) {
            if (TimeOfMeal.equalsIgnoreCase("L") ){
                return 9.95;
            }else if (TimeOfMeal.equalsIgnoreCase("D") ){
                return 15.95;
            }else {
                throw new NullPointerException("Not available");
            }
        }
        
        return 0.0;
    }

    public double calcPrice() {
        return getPriceOfTempura()+getPriceOfRoll()+getPoS();
    }

    public String toString() {
        return "Enjoy your sushi!";
    }

}
