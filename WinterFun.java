
/**
 * Write a description of class WinterFun here.
 *
 * @author David D
 * @version 1/30/19
 */
import java.util.*;
public class WinterFun
{
    public static void main(String[] args) {
        ArrayList<String> winterFun = new ArrayList<String>();
        winterFun.add("EatingCookies");
        winterFun.add("Skiing");
        winterFun.add("Sledding");
        winterFun.add("WatchingMovies");
        winterFun.add("VisitingFamily");
        System.out.println(winterFun);
        winterFun.add(0, "Shoveling");
        System.out.println(winterFun);
        winterFun.add("VisitingFriends");
        System.out.println(winterFun);
        winterFun.set(winterFun.indexOf("WatchingMovies"), "WatchingTV");
        System.out.println(winterFun);
        System.out.println("One random thing: " + winterFun.get((int) (Math.random() * winterFun.size())));
        System.out.println("Winter Fun List");
        for (int i=0; i<winterFun.size(); i++) {
            System.out.println(winterFun.get(i));
        }
        
        sort(winterFun);
        System.out.println("Winter Fun List (Sorted)");
        for (int i=0; i<winterFun.size(); i++) {
            System.out.println(winterFun.get(i));
        }
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
