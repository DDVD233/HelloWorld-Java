
/**
 * Write a description of class SecretCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class SecretCode
{
    static Scanner scanner;
    static String LPNumber;
    static String LPState;
    static String secretCode;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        enterLicensePlate();
        enterLicenseState();
        getFirstCharacter();
        getSecondCharacter();
        getThirdCharacter();
        getForthCharacter();
        getFifthCharacter();
        getSixthCharacter();
        printSecretCode();
    }
    
    static void enterLicensePlate() {
        System.out.println("Please enter your license plate number.");
        LPNumber = scanner.next();
        LPNumber = checkDash(LPNumber);
        if (LPNumber.length() > 8) {
            System.out.println("Plate number too long. Please try again.");
        } else if (LPNumber.length() < 5) {
            System.out.println("Plate number too short. Please try again.");
        } else {
            return;
        }
        
        enterLicensePlate();
        System.out.println("");
    }
    
    /*
    static boolean containsIllegalCharacters(String str) {
        boolean isContainsIllegalCharacter = 
        for (int i=0;i<str.length();i++) {
            String thisChar = str.substring(i, i+1);
            if (thisChar.compareTo("0")>=0 && thisChar.compareTo("9")<=0) ||
                
        }
    }
    */
    
    static String checkDash(String str) {
        String unDashed = new String(str);
        if (unDashed.indexOf("-")!=-1) {
            int dashIndex = unDashed.indexOf("-");
            unDashed = unDashed.substring(0,dashIndex) + str.substring(dashIndex+1);
            unDashed = checkDash(unDashed);
        }
        
        return unDashed;
    }
    
    static void enterLicenseState() {
        System.out.println("Please enter your license plate state.");
        LPState = scanner.next();
        
        if (LPState.length() > 2) {
            System.out.println("Plate state too long. Please try again.");
            enterLicenseState();
        } else if (LPState.length() < 2) {
            System.out.println("Plate state too short. Please try again.");
            enterLicenseState();
        }
    }
    
    static void getFirstCharacter() {
        switch (LPNumber.length()) {
            case 5:
                secretCode = "B";
                break;
            case 6:
                secretCode = "C";
                break;
            case 7:
                secretCode = "D";
                break;
            case 8:
                secretCode = "E";
                break;
            default:
                System.out.println("What? That's impossible.");
        }
    }
    
    static void getSecondCharacter() {
        if (LPNumber.length()%2==0) {
            secretCode += "G";
        } else {
            secretCode += "F";
        }
    }
    
    static void getThirdCharacter() {
        if (LPNumber.substring(0,1).equalsIgnoreCase("A")) {
            secretCode += "B";
        } else {
            secretCode += "Z";
        }
    }
    
    static void getForthCharacter() {
        String secondC = LPNumber.substring(1,2);
        int compareResult = secondC.compareTo("M");
        if (compareResult<0) {
            secretCode += "1";
        } else if (compareResult==0) {
            secretCode += "2";
        } else {
            secretCode += "3";
        }
    }
    
    static void getFifthCharacter() {
        if (LPNumber.substring(2,3).equals(LPNumber.substring(4,5))) {
            secretCode += "A";
        } else {
            secretCode += "B";
        }
    }
    
    static void getSixthCharacter() {
        switch (LPState) {
            case "NJ":
                secretCode += "*";
                break;
            case "PA":
                secretCode += "#";
                break;
            case "CA":
                secretCode += "&";
                break;
            case "HI":
                secretCode += "!";
                break;
        }
    }
    
    static void printSecretCode() {
        System.out.print("Here is your secret code: ");
        System.out.println(secretCode);
    }
}
