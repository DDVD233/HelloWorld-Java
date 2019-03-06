
/**
 * Write a description of class Colors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class Colors
{
    static Scanner scan;
    static String[] colors;
    public static void main(String[] args) {
        colors = new String[23];
        scan = new Scanner(System.in);
        int j=0;

        //Finding files
        try 
        {
            Scanner fileScan2 = new Scanner(new File("colors.csv")); 
            while (fileScan2.hasNext() && j<colors.length) 
            {
                colors[j] =fileScan2.next(); 
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        System.out.println("What do you want to do?");
        System.out.println("1. Print the list vertically");
        System.out.println("2. Print the list horizontally");
        System.out.println("3. Print the list backwards");
        System.out.println("4. Change all gray’s to grey (in the code)");
        System.out.println("5. Count the number of items that are rainbow colors");
        System.out.println("6. If there are any duplicates change the 2nd item to “duplicate” + color.");
        System.out.println("7. Remove from the array any navy colors");
        System.out.println("8. Sort the colors in ascending order.");
        switch (scan.nextInt()) {
            case 1:
            printVertically();
            break;
            case 2:
            printHorizontally();
            break;
            case 3:
            printBackward();
            break;
            case 4:
            changeGray();
            printVertically();
            break;
            case 5:
            countRainbow();
            break;
            case 6:
            findDuplicate();
            printVertically();
            break;
            case 7:
            removeNavy();
            printVertically();
            break;
            case 8:
            sort();
            printVertically();
            break;
        }
    }

    static void printVertically() {
        for (int i=0; i<colors.length; i++) {
            System.out.println(colors[i]);
        }
    }

    static void printHorizontally() {
        for (int i=0; i<colors.length; i++) {
            System.out.print(colors[i]);
            System.out.print(" - ");
        }
    }

    static void printBackward() {
        for (int i=colors.length-1; i>=0;i--) {
            System.out.println(colors[i]);
        }
    }

    static void changeGray() {
        for (int i=0; i<colors.length;i++) {
            if (colors[i].equals("gray")) {
                colors[i]="grey";
            }
        }
    }

    static void countRainbow() {
        int count = 0;

        ArrayList<String> colorList = getColorList();
        for (int i=0; i<colors.length; i++) {
            if (colorList.contains(colors[i])) {
                count++;
            }
        }

        System.out.println("Here's the count:" + count);
    }

    static ArrayList<String> getColorList() {
        ArrayList<String> arrList = new ArrayList<String>(7);
        String[] rainbowColor = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        for (int i=0; i< rainbowColor.length; i++) {
            arrList.add(rainbowColor[i]);
        }

        return arrList;
    }

    static void findDuplicate() {
        ArrayList<String> arrList = new ArrayList<String>(23);

        for (int i=0; i< colors.length; i++) {
            if (arrList.contains(colors[i])) {
                colors[i] = "duplicate " + colors[i];
            } else {
                arrList.add(colors[i]);
            }
        }
    }

    static void removeNavy() {
        for (int i=0; i< colors.length; i++) {
            if (colors[i].equals("navy")) {
                for (int j=i;j<colors.length-1;j++) {
                    colors[j]=colors[j+1];
                }
            }
        }
    }

    /**
     * My original plan was to write a fast sort.
     * But...
     * Nah
     * Bubble sort is enough.
     */
    static void sort() {
        for(int i=0; i<colors.length; i++){
            for(int j=1; j<colors.length-i; j++){
                if(colors[j-1].compareTo(colors[j]) > 0){
                    String temp;
                    temp = colors[j-1];
                    colors[j-1] = colors[j];
                    colors[j]=temp;
                }
            }
        }
    }
}
