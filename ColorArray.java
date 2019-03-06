
/**
 * Write a description of class ColorArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class ColorArray
{   static String[] colors = new String[23];
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int j=0;
        try 
        {
            Scanner fileScan2 = new Scanner(new File("colors.csv")); 
            while (fileScan2.hasNext()) 
            {
                colors[j] =fileScan2.next(); 
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        Co();
    }

    static void Co() {

        for (int i=0; i<colors.length;i++) {
            System.out.println(colors[i]);
        }

        for (int i=0; i<colors.length;i++) {
            System.out.print(colors[i]);
        }

        for (int i=(colors.length-1); i>=0;i--) {
            System.out.println(colors[i]);
        }

        for (int i=0; i<colors.length;i++) {
            if (colors[i].equals("gray")) {
                colors[i]="grey";
            }
        }

        int count=0;
        for (int i=0; i<colors.length;i++) {
            if ((colors[i].equals("red"))||(colors[i].equals("orange"))||
            (colors[i].equals("yellow"))||(colors[i].equals("green"))||
            (colors[i].equals("blue"))||(colors[i].equals("indigo"))||
            (colors[i].equals("violet"))) {
                count++;

            }
        }
        System.out.println(count);

        for (int i=0; i<colors.length;i++) {
            for(int p=0; p<i;p++) {
                if (colors[i].equals(colors[p])) {
                    colors[i]="duplicate "+colors[i];
                }
            }
        }

        for (int i=0; i<colors.length;i++) {
            if (colors[i].equals("navy")) {
                for (int y=i;y<colors.length;i++) {
                    colors[i]=colors[i+1];
                }
            }
        }

        for (int i=0; i<colors.length;i++) {
            if (colors[i].equals("white")) {
                System.out.println("My favorite color is number "+i);
            }
        }
    }

}


