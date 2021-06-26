package src.com.github.TylerWhitmore.cs3230;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        boolean cont = true;
        //clearScreen();
        //System.out.println("Please enter a list of integers separated by a space:");
        int[] integers = CLI.getNewNumbers();
        while(cont){
        System.out.println("Current list of integers:" + Arrays.toString(integers));
        System.out.println("Choose and operation:");
        System.out.println("1. Sum - adds all the integers");
        System.out.println("2. Evens - finds all the evens");
        System.out.println("3. Odds - finds all the odds");
        System.out.println("4. Max - finds the largest integer");
        System.out.println("5. Min - finds the smallest integer");
        System.out.println("6. Update - enter a new list of integers");
        System.out.println("7. Exit");
        int response = CLI.getUserInput();
        switch(response){
            case 1:
                System.out.println(">-1");
                System.out.println(Calculations.sum(integers));
                break;
            case 2:
                System.out.println(">-2");
                System.out.println(Calculations.evens(integers));
                break;
            case 3:
                System.out.println(">-3");
                System.out.println(Calculations.odds(integers));
                break;
            case 4:
                System.out.println(">-4");
                System.out.println(Calculations.max(integers));
                break;
            case 5:
                System.out.println(">-5");
                System.out.println(Calculations.min(integers));
                break;
            case 6:
                System.out.println(">-6");
                integers = CLI.getNewNumbers();
                break;
            default:
                System.out.println(">-7");
                cont = false;
                break;
        }
    }

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}