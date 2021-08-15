package src.com.github.TylerWhitmore.cs3230;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CLI {
    public static Scanner myScanner = new Scanner(System.in);

    public static int getUserInput(){
        String input = myScanner.next();
        int i = 0;
        try{
            i = Integer.parseInt(input);
        }
        catch (NumberFormatException ex){
            System.out.println("Invalid response: "+ input);
        }
        myScanner.nextLine();
        return i;
    }

    public static double[] getNewNumbers(){
        System.out.println("Please enter a list of integers separated by a space:");
        String[] userInput = myScanner.nextLine().split("\\s+");
        double[] doubles = new double[userInput.length];
        for(int i = 0; i < userInput.length; i++){
            try{
                doubles[i] = Double.parseDouble(userInput[i]);
            }
            catch (NumberFormatException ex){
                System.out.println("Invalid double: " + userInput[i]);
            }
        }
        return doubles;
    }

    public static List<String> getStrings(){
        System.out.println("Please enter a list of strings separated by spaces:");
        String[] userInput = myScanner.nextLine().split("\\s+");
        List<String> listStrings = new ArrayList<String>(Arrays.asList(userInput));
        return listStrings;
    }
}