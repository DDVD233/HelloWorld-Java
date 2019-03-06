import java.util.*;
import java.io.*;

public class ILNames {
    static ArrayList<String> lastNames = new ArrayList<String>();
    static ArrayList<String> firstNames = new ArrayList<String>();
    static ArrayList<String> grades = new ArrayList<String>();
    static ArrayList<String> trips = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) { 

        //Finding files
        try 
        {
            Scanner fileScan2 = new Scanner(new File("LastNames.csv")); 
            while (fileScan2.hasNext()) 
            {
                lastNames.add(fileScan2.nextLine());

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        try 
        {
            Scanner fileScan2 = new Scanner(new File("FirstNames.csv")); 
            while (fileScan2.hasNext()) 
            {
                firstNames.add(fileScan2.nextLine());

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        try 
        {
            Scanner fileScan2 = new Scanner(new File("Trips.csv")); 
            while (fileScan2.hasNext()) 
            {
                trips.add(fileScan2.nextLine());

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        try 
        {
            Scanner fileScan2 = new Scanner(new File("Grades.csv")); 
            while (fileScan2.hasNext()) 
            {
                grades.add(fileScan2.nextLine());

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename");
        }

        System.out.println(firstNames);
        System.out.println(lastNames);
        System.out.println(grades);
        System.out.println(trips);

        System.out.println("What do you want to do?");
        System.out.println("1. Enter a name - Print the students IL program");
        System.out.println("2. Enter a grade - Print Students in that grade");
        System.out.println("3. Enter an IL program - Print everyone in that program.");
        System.out.println("4. Sort all names");
        switch (scanner.nextInt()) {
            case 1:
            nameToProgram();
            break;
            case 2:
            printGrade();
            case 3:
            programToName();
            case 4:
            sort(firstNames);
            for (int i=0; i<firstNames.size(); i++) {
                System.out.println(firstNames.get(i));
            }
            break;
        }
        
    }
    
    static void printGrade() {
        System.out.println("Please enter a grade: ");
        String grade = scanner.next();
        for (int i=0; i<lastNames.size(); i++) {
            if (grades.get(i).equals(grade)) {
                System.out.print(firstNames.get(i));
                System.out.print("     ");
                System.out.print(lastNames.get(i));
                System.out.print("     ");
                System.out.print(trips.get(i));
                System.out.println("");
            }
        }
    }
    
    static ArrayList<Integer> indexForPrograms(String programName) {
        ArrayList<Integer> indexes = new ArrayList<Integer>(); 
        for (int i=0; i<trips.size(); i++) {
            if (programName.equalsIgnoreCase(trips.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
   
    static void programToName() {
        System.out.println("Here's a list of programs. Which one do you want to check?");
        String[] listPrograms = {"Bayshore Experience", "Blacksmithing", 
            "Chinese Culture", "Cuba: La Iglesia de los Amigos", "Cultural and Linguistic Diversity in Martinique",
            "Food: Cooking, Customes and Culture", "Give Kids the World: FL", "Ireland, Wales and England",
            "Lets Sew for Babies", "Math and Science in Greece and Italy", "Mindfulness through art, yoga and food"
            ,"Multicultural Philadelphia", "Museums: A peek behind the scenes", "Pinelands Experience"
            , "Puerto Rico: Hurricane Maria Relief", "Sacred Spaces", "SJ Service Learning", 
            "Permission to attend swim competition"};
        for (int i=0; i<listPrograms.length; i++) {
            System.out.println(i + ". " + listPrograms[i]);
        }
        
        System.out.println("First name           Last Name     Trips");
        String programChosen = listPrograms[scanner.nextInt()];
        ArrayList<Integer> indexList = indexForPrograms(programChosen);
        for (int i=0; i<indexList.size(); i++) {
            System.out.println(firstNames.get(i) + "           " + lastNames.get(i));
        }
    }
    
    static void nameToProgram() {
        scanner.nextLine();
        System.out.println("Please enter the first name");
        String firstName = scanner.nextLine();
        ArrayList<Integer> firstNameIndex = indexesOf(firstName, firstNames); 
        System.out.println(firstNameIndex);
        if (firstNameIndex.size() == 0) {
            System.out.println("Name not found! Please check your spelling");
            return;
        }
        System.out.println("Please enter the last name");
        String lastName = scanner.nextLine();
        int trueIndex = -1;
        for (int i=0; i<firstNameIndex.size(); i++) {
            if (lastNames.get(firstNameIndex.get(i)).equalsIgnoreCase(lastName)) {
                trueIndex = firstNameIndex.get(i);
                break;
            }
        }
        
        if (trueIndex == -1) {
            System.out.println("Name not found! Please check your spelling");
            return;
        }
        
        String program = trips.get(trueIndex);
        System.out.println(firstName + " " + lastName + " is in " + program);
        // String program = trip.get(1);
    }
    
    static ArrayList<Integer> indexesOf(String str, ArrayList<String> array) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i=0; i<array.size(); i++) {
            if (str.equalsIgnoreCase(array.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    
    static void sort(ArrayList<String> array) {
        for (int i=0; i<array.size(); i++) {
            for (int j=1; j<array.size()-i; j++) {
                if (array.get(j-1).compareTo(array.get(j)) > 0) {
                    String temp;
                    temp = array.get(j-1);
                    array.set(j-1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    }
}