
import java.util.*;
import java.io.*;

public class states2
{
    //Data Declarations
    static String[] states = new String[50];
    static String[] capitals = new String[50];
    static String[] hints = new String[55];
    //Scanner
    static Scanner scan;
    public static void main(String[] args)
    { 
        scan = new Scanner(System.in);
        int j=0;

        //Finding files
        try 
        {
            Scanner fileScan2 = new Scanner(new File("states.csv")); 
            while (fileScan2.hasNext()) 
            {
                states[j] =fileScan2.next(); 
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        j=0;
        try 
        {
            Scanner fileScan2 = new Scanner(new File("capitals.csv")); 
            while (fileScan2.hasNext()) 
            {
                capitals[j] =fileScan2.next(); 
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }
        
        j=0;
        try 
        {
            Scanner fileScan2 = new Scanner(new File("hints.csv")); 
            while (fileScan2.hasNext()) 
            {
                hints[j] =fileScan2.next(); 
                System.out.println(fileScan2.next());
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        displayMenu();
    }

    static void displayMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1 - List all of the states and capitals (Trenton, New Jersey)");
        System.out.println("2 - Enter a state and I’ll give you the capital");
        System.out.println("3 - Enter a capital and I’ll give you the state");
        System.out.println("4 - I’ll give you a random state and you guess the capital");
        System.out.println("5 - Exit");

        int choice = scan.nextInt();
        scan.nextLine();
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        switch (choice) {
            case 1:
            listAll();
            break;
            case 2:
            System.out.println("Enter a state: ");
            String stateInputed = scan.nextLine().replace(" ", "");
            String capital = stateToCapital(stateInputed);
            System.out.print("The capital is " + capital + ".");
            break;
            case 3:
            System.out.print("Enter a capital: ");
            String capitalInput = scan.nextLine().replace(" ", "");
            String state = capitalToState(capitalInput);
            System.out.print("The satte is " + state + ".");
            break;
            case 4:
            String stateChosen = randomState();
            System.out.println("What's the capital of " + stateChosen + "?");
            String capitalChosen = stateToCapital(stateChosen);
            int index=0;
            while (true) {
                if (capitalChosen.equalsIgnoreCase(scan.nextLine())) {
                    System.out.println("Congrats! That is correct.");
                    break;
                } else {
                    System.out.println("Incorrect.");
                    if (index == 0) {
                        System.out.println("Here's a hint:");
                        System.out.println(capitalToHints(capitalChosen));
                    }
                    System.out.println("Here's the letter " + (index+1) + ": " + capitalChosen.substring(index, index+1));
                    System.out.print("Try again: ");
                    
                }
            }

            break;
            case 5:
            return;
        }

        displayMenu();
    }

    static void listAll() {
        System.out.println("States                   Capital"); //20
        for (int i=0;i<states.length;i++) {
            String thisState = states[i];
            if (thisState==null) {
                continue;
            }
            System.out.print(thisState);
            for (int j=0;j<(25-thisState.length());j++) {
                System.out.print(" ");
            }

            System.out.println(capitals[i]);
        }
    }

    static String stateToCapital(String stateChosen) {
        return capitals[indexOf(states, stateChosen)];
    }
    
    static String capitalToHints(String capitalChosen) {
        return hints[indexOf(capitals, capitalChosen)];
    }

    static int indexOf(String[] array, String object) {
        for (int i=0; i<array.length; i++) {
            if (array[i]==null) continue;
            if (array[i].equalsIgnoreCase(object)) {
                return i;
            }
        }
        System.out.println(object + " does not exist!");
        return -1;
    }

    static String capitalToState(String capitalChosen) {
        return states[indexOf(capitals, capitalChosen)];
    }

    static String randomState() {
        return states[(int) (Math.random()*states.length)];
    }
}