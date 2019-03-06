
import java.util.*;
import java.io.*;

public class States
{
    static String[] states;
    static String[] capitals;
    public static void main(String[] args)
    { 
        //Data Declarations
        states = new String[51];
        capitals = new String[51];

        //Scanner
        Scanner scan = new Scanner(System.in);

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

        Menu();
    }

    static void Menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What u can do:");
        System.out.println("1-list all states and capitals");
        System.out.println("2-u can give me a state and I'll give u the capital");
        System.out.println("3-u can give me a capital and I'll give u the state");
        System.out.println("4-I'll give u a random state and u can guess the capital");
        System.out.println("5-Exit");

        int choice=scan.nextInt();
        if (choice==1) {
            ListofAll() ;
        }else if (choice==2) {
            System.out.println("Enter a state.");
            String state=scan.next();
            String capital=StoC(state);
            System.out.println("The capital is "+capital);

        }else if (choice==3) {
            System.out.println("Enter a capital.");
            String capital=scan.next();
            String state=CtoS(capital);
            System.out.println("The state is "+state);

        }else if (choice==4) {
            String randomState=random();
            System.out.println("What's the capital of "+randomState);
            String answer = STC(randomState);
            int index=0;
            while (true) {
                if (answer.equalsIgnoreCase(scan.next())) {
                    System.out.println("you are such a smarty donkey!");
                    break;
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Here's the letter " + (index+1) + ": " + answer.substring(index, index+1));
                    System.out.print("Try again: ");
                    index++;
                }
            }

            
        }else if (choice==5) {
            System.out.println("bye!");

        }
    }
    static  void ListofAll() {
        System.out.println("States         Capitals");
        for (int i=0;i<51;i++) {
            System.out.println(states[i]+"         "+capitals[i]);
        }

    } 

    static String StoC(String state) {
        for (int i=0;i<51;i++) {
            if (states[i].equalsIgnoreCase(state)) {
                return capitals[i];
            }
        }    
        return " ";
    }

    static String CtoS(String capital) {
        for (int i=0;i<51;i++) {
            if (capitals[i].equalsIgnoreCase(capital)) {
                return states[i];
            }
        }    
        return " ";
    }

    static String random() {
        return states[(int) (Math.random()*states.length)];
    }

    static String STC(String randomstate) {
        for (int i=0;i<51;i++) {
            if (states[i].equalsIgnoreCase(randomstate)) {
                return capitals[i];
            }
        }    
        return " ";
    }
}

