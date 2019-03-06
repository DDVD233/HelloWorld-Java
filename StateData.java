
/**
 * Write a description of class StateData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StateData
{
    // instance variables - replace the example below with your own
    private String name;
    private String abbreviation;
    private String capital;
    private double population;
    private double latitude;
    
    private static String country="US";

    /**
     * Constructor for objects of class StateData
     */
    public StateData(String name, String abbreviation, String capital, double population)
    {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
        this.population = population;
    }
    
    public StateData() {
        name = "";
        abbreviation = "";
        capital = "";
        population = 0;
    }
    
    public StateData(String aName) {
        name = aName;
        abbreviation = "";
        capital = "";
        population = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    public void setPopulation(double population) {
        this.population = population;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public static void setCountry(String aCountry) {
        country = aCountry;
    }
    
    public String getName() {
        return name;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public String getAbbreviation() {
        return abbreviation;
    }
    
    public String getCapital() {
        return capital;
    }
    
    public double getPopulation() {
        return population;
    }
    
    public static String getCountry() {
        return country;
    }
}
