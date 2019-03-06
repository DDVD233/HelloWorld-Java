
/**
 * Write a description of class PresentData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PresentData
{
    public static void main(String[] args) {
        String[] names = new String[]{"Ethan", "Wei", "Xuanle", "William K.", "William L.", "Michel", "Miao", "Jack", "Zetian"};
        int[] ages = new int[]{17, 17, 16, 16, 16, 17, 17, 17, 16};
        int[] gradeLevel = new int[]{12,12,11,11,11,12,12,12,11};
        
        for (int i=0; i<9; i++) {
            System.out.println(names[i] + " is " + ages[i] + " years old and in " + gradeLevel[i] + "th grade.");
        }
    }
}
