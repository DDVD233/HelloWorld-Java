
/**
//preconditions: restaurant is Buffalo Wild Wings
defeault meal is 10 mild wings, 1 small drink.
wing flavors: hot and mild (both have the same price)
drink sizes (dsize): small and large
users can also order wings only, or drinks only, or both wings and drinks.
//postconditions: total price of the meal with tax will be returned.
 */
public class BuffaloWildWings
{
    private String flavor;
    public double price=0;
    private int numwings;
    private int numdrink;
    private String dsize;
    private static double sdrinkPrice=1.50;
    private static double ldrinkPrice=2.00;
    private static double perWingPrice=0.8;
    private static double tax=0.08;
    //constructor
    public BuffaloWildWings (String flavor, int numwings, int numdrink, String dsize)
    {
        this.flavor=flavor;
        this.numwings=numwings;
        this.numdrink=numdrink;
        this.dsize=dsize;
    }

    public BuffaloWildWings ()
    {
        this.flavor="mild";
        this.numwings=10;
        this.numdrink=1;
        this.dsize="small";
    }

    public BuffaloWildWings (String flavor, int numwings)
    {
        this.flavor=flavor;
        this.numwings=numwings;
        this.numdrink=0;
        this.dsize="";
    }

    public BuffaloWildWings (int drink, String dsize)
    {
        this.flavor="";
        this.numwings=0;
        this.numdrink=numdrink;
        this.dsize=dsize;
    }
    //accessor
    public String getFlavor(){
        return flavor;}

    public int getNumwings(){
        return numwings;}

    public int getNumdrink(){
        return numdrink;}

    public String getDsize(){
        return dsize;}

    public static double getSdrinkPrice(){
        return sdrinkPrice;
    }

    public static double getLdrinkPrice(){
        return ldrinkPrice;
    }
    // mutator
    public void setFlavor(){
        this.flavor=flavor;
    }

    public void setNumwings(){
        this.numwings=numwings;
    }

    public void setNumdrink(){
        this.numdrink=numdrink;
    }

    public void setDsize(){
        this.dsize=dsize;
    }

    public void setSdrinkPrice(){
        this.sdrinkPrice=sdrinkPrice;
    }

    public void setLdrinkPrice(){
        this.ldrinkPrice=ldrinkPrice;
    }
    //processing
    public double calcPrice(){
        if (dsize.equalsIgnoreCase("small")){
            price=(numwings*perWingPrice+numdrink*sdrinkPrice)*(1 + tax);
        }
        if (dsize.equalsIgnoreCase("large")){
            price=(numwings*perWingPrice+numdrink*ldrinkPrice)*(1 + tax);
        }  
        return price;
    }
    //to string
    public String toString()
    {
        return "have a nice day!";
    }
}