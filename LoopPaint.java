
/**
 * Write a description of class LoopPaint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopPaint
{
    public static void main(String[] args) {
        for (int i=1; i<50; i++) {
            int spMaximum = 50-i;
            for (int j=0; j<spMaximum; j++) {
                System.out.print(" ");
            }
            
            for (int j=0; j<(int)(i); j++) {
                if (i%7!=0 && (j%(i%7)<1)) {
                    System.out.print("++");
                } else if (j%2 == 1) {
                    System.out.print("\u02CA_>\u02CB");
                } else {
                    System.out.print("`");
                }
            }
            
            System.out.println("");
        }
    }
}
