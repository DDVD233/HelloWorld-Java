
/**
 * Write a description of class VariableInCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VariableInCode
{
    
  
    public static void main(String[] args) {
        String day = "";
        int temp = 0;
        String weatherDescription = "";
        String homeworkDescription = "";
        String firstClassDescription = "";
        int dayInMonth = 0;
        String month = "";
        int year = 0;
        
        day = "Monday";
        temp = 23;
        weatherDescription = "Sunny";
        homeworkDescription = "a lot of";
        firstClassDescription = "Computer Science";
        dayInMonth = 18;
        month = "September";
        year = 2018;
        
        
        System.out.print("Today is " + day);
        System.out.println(", " + month + " " + dayInMonth + ", " + year + ". ");
        System.out.println("It's " + temp + " degrees and " +  weatherDescription + ". ");
        System.out.println("I have " + homeworkDescription + " homework. ");
        System.out.println("My first class is " + firstClassDescription + ". ");
        
    }
}
