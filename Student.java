
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private int grade;
    private int studentID;
    private double gpa;
    private boolean isChris;
    
    static private String schoolName = "MFS";
    static private int numOfClassPerDay = 9;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int grade, int studentID, double gpa, boolean isChris) {
        // initialise instance variables
        this.name = name;
        this.grade = grade;
        this.studentID = studentID;
        this.isChris = isChris;
        if (isChris) {
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }
    
    public Student() {
        name = "";
        grade = 0;
        studentID = 0;
        gpa = 0.0;
        isChris = false;
    }
    
    public int getGrade() {
        // put your code here
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int getStudentID() {
        // put your code here
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public String getName() {
        // put your code here
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getGpa() {
        // put your code here
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public boolean getIsChris() {
        // put your code here
        return isChris;
    }
    
    public void setIsChris(boolean isChris) {
        this.isChris = isChris;
    }
    
    public static String getSchoolName() {
        // put your code here
        return schoolName;
    }
    
    public static void setSchoolName(String aSchoolName) {
        schoolName = aSchoolName;
    }
    
    public static int getNumOfClassPerDay() {
        // put your code here
        return numOfClassPerDay;
    }
    
    public static void setNumOfClassPerDay(int aNumOfClassPerDay) {
        numOfClassPerDay = aNumOfClassPerDay;
    }
    
    public String gradeName() {
        switch (grade) {
            case 12:
                return "Senior";
            case 11:
                return "Junior";
            case 10:
                return "Sophomore";
            case 9:
                return "Freshman";
        }
        
        return "";
    }

}
