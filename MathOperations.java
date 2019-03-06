
/**
 * Write a description of class MathOperations here.
 *
 * @author David Dai
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class MathOperations
{   
    public static void main(String[] args) {
        
        menu();
    }
    
    static void menu() {
        String intro = "What do you want to do?";
        String option1 = "1. Preset a distance in KM - Convert to Miles";
        String option2 = "2. Preset ageInYears - convert to ageInDays, ageInHours, ageInMinutes";
        String option3 = "3. Preset a temperature in Celcius - Convert it to Fahrenheit";
        String option4 = "4. Preset a temperature in Fahrenheit - Convert it to Celcius";
        String option5 = "5. Convert Fahrenheit to Kelvin";
        String option6 = "6. Convert cm3 to kilogram";
        
        System.out.println(intro);
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
        System.out.println(option5);
        System.out.println(option6);
        
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        
        if (option == 1) {
            kmToMiles();
        } else if (option == 2) {
            ageInDays();
        } else if (option == 3) {
            cToF();
        } else if (option == 4) {
            fToC();
        } else if (option == 5) {
            fToK();
        } else if (option == 6) {
            mlToKg();
        } else {
            System.out.println("Option not found.");
            goBack();
        }
    }
    
    static void kmToMiles() {
        System.out.println("Enter your distance in km");
        Scanner scanner = new Scanner(System.in);
        double distance = Double.valueOf(scanner.next());
        
        System.out.println(distance*1.6);
        
        goBack();
    }
    
    static void ageInDays() {
        System.out.println("Enter your age in years");
        Scanner scanner = new Scanner(System.in);
        double year = Double.valueOf(scanner.next());
        
        double ageInDays = year * 365;
        double ageInHours = ageInDays * 24;
        double ageInMinutes = ageInHours * 60;
        
        System.out.println(year + " years");
        System.out.println("= " + ageInDays + " days");
        System.out.println("= " + ageInHours + " hours");
        System.out.println("= " + ageInMinutes + " minutes");
        
        goBack();
    }
    
    static void cToF() {
        System.out.println("Enter your temperature in celcius");
        Scanner scanner = new Scanner(System.in);
        double celcius = Double.valueOf(scanner.next());
        
        double fa = celcius * 1.8 + 32;
        
        System.out.println("It's equal to " + fa + " Fahrenheit.");
        
        goBack();
    }
    
    static void fToC() {
        System.out.println("Enter your temperature in Fahrenheit");
        Scanner scanner = new Scanner(System.in);
        double fa = Double.valueOf(scanner.next());
        
        double cel = (fa - 32)/1.8;
        
        System.out.println("It's equal to " + cel + " celcius.");
        
        goBack();
    }
    
    static void fToK() {
        System.out.println("Enter your temperature in Fahrenheit");
        Scanner scanner = new Scanner(System.in);
        double fa = Double.valueOf(scanner.next());
        
        double k = (fa - 32)/1.8 + 273;
        
        System.out.println("It's equal to " + k + " kelvin.");
        
        goBack();
    }
    
    static void mlToKg() {
        System.out.println("Enter volume (in cm3)");
        Scanner scanner = new Scanner(System.in);
        double v = Double.valueOf(scanner.next());
        
        System.out.println("Enter density (in g/cm3)");
        double density = Double.valueOf(scanner.next());
        
        double weight = (v * density) / 1000;
        System.out.println("It weights " + weight + " kilograms.");
        
        goBack();
    }
    
    static void goBack() {
        System.out.println("Do you want to go back to the menu?(y or n)");
        
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        
        if (response.equals("y")) {
            menu();
        }
    }
}
