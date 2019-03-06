
/**
 * Write a description of class RandomProcess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomProcess
{
    public static void main(String[] args) {
        int random050 = (int) (Math.random() * 51);
        int random150 = 1 + (int) (Math.random() * 50);
        int random550 = 5 + (int) (Math.random() * 46);
        int random732 = 7 + (int) (Math.random() * 26);
        int randomN3100 =  + (int) (Math.random() * 26);
        
        String town = "Moorestown";
        int randIndex = (int) (Math.random()*town.length());
        String randomLetter = town.substring(randIndex, randIndex+1);
        
        
    }
}
