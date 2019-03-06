
/**
 * Write a description of class IntroClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private int numLegs;
    private String name;
    private String color;
    private boolean tail;
    private static String material;
    
    
    public int getNumLegs() {
        return numLegs;
    }
    
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setTail(boolean tail) {
        this.tail = tail;
    }
    
    public boolean getTail() {
        return tail;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }
    
}
