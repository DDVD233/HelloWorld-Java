
/**
 * Write a description of class studentClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student1
{
    // instance variables - replace the example below with your own
    private String name;
    private int grade;
    private int lockercode;
    private int age;
    private double gpa;
    private boolean isJunior;

    static private String schoolName="MFS";
    static private int NoC=8;
    /**
     * Constructor for objects of class studentClass
     */
    public student1(String name, int grade, int lockercode, int age, double gpa, boolean isJunior)
    {
        // initialise instance variables
        this.name=name;
        this.grade=grade;
        this.lockercode=lockercode;
        this.age=age;
        this.gpa=gpa;
        this.isJunior=isJunior;
    }

    public student1() {
        name="";
        grade=0;
        lockercode=0;
        age=0;
        gpa=0.0;
        isJunior=true;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getLockercode() {
        return lockercode;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean getIsJunior() {
        return isJunior;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static int getNoC() {
        return NoC;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setGrade(int grade) {
        this.grade=grade;
    }

    public void setLockercode(int lockercode) {
        this.lockercode=lockercode;
    }

    public void setAge(int age) {
        this.age=age;
    }
    
    public void setGpa(int gpa) {
        this.gpa=gpa;
    }
    
    public void setIsJunior(boolean isJunior) {
        this.isJunior=isJunior;
    }
    
    public static void setSchoolName(String MFS){
        schoolName=MFS;
    }
    
     public static void setNoC(int numberOfClass){
        NoC=numberOfClass;
    }
    
    public void gradeDtermine() {
        if (grade == 12) {
            System.out.println("Senior");
        }else if (grade == 11) {
            System.out.println("Junior");
        }else if (grade == 10) {
            System.out.println("Sophomore");
        }else if (grade == 9) {
            System.out.println("Freshman");
        }
    }
}
