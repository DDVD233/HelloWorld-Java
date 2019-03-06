
public class Students
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private double gpa;
    private int grade;
    
    private static String school = "Moorestown Friends School";
 
    // Default Constructor
    public Students()
    {
        // initialise instance variables
        name = " ";
        age = 0;
        gpa = 0.0;
        grade = 0;
    }
    
    // Constructor with Parameters
    public Students(String name, int age, double gpa, int grade)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.grade = grade;
    }
    
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    
    public int getGrade()
    {
        return grade;
    }
    public double getGpa()
    {
        return gpa;
    }
      
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    
    public String toString()
    {
        return "Student Data";
    }

}
