
/**
 * Write a description of class SaturdayPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class SaturdayPlan {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        String[] movies = {"Aquaman", "Spiderman", "Ralph Breaks the Internet", "Venom"};
        String[] restaurant = {"Akira", "Burger King", "ChickFilA", "Fridays"};
        String[] activities = {"played hiking", "played basketball", "played video games"};
        
        System.out.println("Do you want to go to a movie? (y for yes)");
        if (scanner.next().equals("y")) {
            String movieToWatch = movies[(int) (Math.random()*movies.length)];
            System.out.println("You watched " + movieToWatch);
        }
        System.out.println("Do you want to go to a restaurant? (y for yes)");
        if (scanner.next().equals("y")) {
            String restaurantToGo = restaurant[(int) (Math.random()*restaurant.length)];
            System.out.println("You had lunch at " + restaurantToGo);
        }
        System.out.println("Do you want to do some activites? (y for yes)");
        if (scanner.next().equals("y")) {
            String activitiesToDo = activities[(int) (Math.random()*activities.length)];
            System.out.println("You " + activitiesToDo);
        }
        
        if (Math.random() < 0.5) {
            System.out.println("You woke up. It was a dream. You are still a poor otaku.");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Sad!");
        }
    }
}
