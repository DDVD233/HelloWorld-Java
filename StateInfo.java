
/**
 * Write a description of class stateInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class StateInfo
{
    public static void main(String[] args) {
        StateData[] states = new StateData[51];
        
        for (int i = 0; i<states.length; i++)
        {
             states[i] = new StateData();
        }
        
        int j=0;//Finding files
        try 
        {
            Scanner fileScan2 = new Scanner(new File("states.csv")); 
            while (fileScan2.hasNext()) 
            {
                states[j].setName(fileScan2.next());
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename - states");
        }
        
        j=0;
        try 
        {
            Scanner fileScan2 = new Scanner(new File("capitals.csv")); 
            while (fileScan2.hasNext()) 
            {
                states[j].setCapital(fileScan2.next());
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename - capitals");
        }
        
        
        j=0;
        try 
        {
            Scanner fileScan2 = new Scanner(new File("populations.csv")); 
            while (fileScan2.hasNextDouble()) 
            {
                states[j].setPopulation(fileScan2.nextDouble());
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename - populations");
        }
        
        j=0;
        try 
        {
            Scanner fileScan2 = new Scanner(new File("Latitude.csv")); 
            while (fileScan2.hasNextDouble()) 
            {
                double lat = fileScan2.nextDouble();
                System.out.println(lat);
                states[j].setLatitude(lat);
                j++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Bad Filename - Latitudes");
        }
        
        
        
        for (StateData x: states)
        {
            printState(x);
        }
        System.out.println("Population larger than 5 million:");
        for (StateData x: states) {
            if (x.getPopulation() > 5000000) {
                printState(x);
            }
        }
        
        System.out.println("Population smaller than 1 million:");
        for (StateData x: states) {
            if (x.getPopulation() < 1000000) {
                printState(x);
            }
        }
        
        double average = 0;
        for (StateData x: states) {
            average += x.getPopulation();
        }
        average = (average - 111)/(states.length - 1);
        System.out.println("Average Population: " + average);
        
        sort(states);
        System.out.println("States with the most population");
        for (int x = 0; x < 5; x++) {
            printState(states[x]);
        }
        
        sortByLatitude(states);
        System.out.println("States with the highest latitude (Most north)");
        for (int x = 0; x < 5; x++) {
            printState(states[x]);
        }
    }
    
    public static void printState(StateData state) {
        String stateName = state.getName();
        System.out.print(stateName);
        for (int i=0; i<(25-stateName.length()); i++) {
            System.out.print(" ");
        }
        
        String stateAbbr = state.getAbbreviation();
        System.out.print(stateAbbr);
        for (int i=0; i<(5-stateAbbr.length()); i++) {
            System.out.print(" ");
        }
        
        String stateCapital = state.getCapital();
        System.out.print(stateCapital);
        for (int i=0; i<(25-stateCapital.length()); i++) {
            System.out.print(" ");
        }
        
        System.out.print(state.getPopulation());
        System.out.println("");
    }
    
    static void sort(StateData[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array.length-i; j++){
                if (array[j-1].getPopulation() < (array[j].getPopulation())){
                    StateData temp;
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;
                }
            }
        }
    }
    
    static void sortByLatitude(StateData[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array.length-i; j++){
                if (array[j-1].getLatitude() < (array[j].getLatitude())){
                    StateData temp;
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
