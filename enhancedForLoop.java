
/**
 * Write a description of class enhancedForLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class enhancedForLoop
{
    public static void main(String[] args) {
        double lunchPrice[] = {2.5, 3.5, 1.25, 35.2, 2.22};
        double total = 0;
        for (double x: lunchPrice) {
            total += x;
        }
        
        System.out.println("Total: " + total);
        double average = total / lunchPrice.length;
        
        System.out.println("Average: " + average);
    }
}
