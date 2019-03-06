
/**
 * Write a description of class ASCII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ASCII
{
    public static void main(String[] args) {
        for (int i=0; i<99990; i++) {
            int times = i%30;
            int spMaximum = Math.round((29-times)/2);
            for (int j=0; j<spMaximum; j++) {
                System.out.print(" ");
            }
            
            for (int j=0; j<times; j++) {
                if (j%2 == 1) {
                    System.out.print(".");
                } else {
                    System.out.print("`");
                }
            }
            
            System.out.println("");
        }
        
        for (int i=0; i<20; i++) {
            System.out.println("        ++++++++");
        }
        // Thread.sleep(1000);
    }
}
