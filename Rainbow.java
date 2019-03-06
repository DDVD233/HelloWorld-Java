
/**
 * Write a description of class Rainbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rainbow
{
    public static void main(String[] args) {
        String[] rainbowColor = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        
        for (int i=0; i<rainbowColor.length; i++) {
            System.out.println(rainbowColor[i]);
            System.out.println(rainbowColor[i].substring(0,1));
        }
    }
}
