package src.com.github.TylerWhitmore.cs3230;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AssignmentTwo {
    private static Scanner myScanner = new Scanner(System.in);

    private static int getUserInput(){
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

    private static int[] getNewNumbers(){
        System.out.println("Please enter a list of integers separated by a space:");
        String[] userInput = myScanner.nextLine().split("\\s+");
        int[] integers = new int[userInput.length];
        for(int i = 0; i < userInput.length; i++){
            try{
                integers[i] = Integer.parseInt(userInput[i]);
            }
            catch (NumberFormatException ex){
                System.out.println("Invalid integer: " + userInput[i]);
            }
        }
        return integers;
    }
    public static void main(String[] args){
        boolean cont = true;
        //clearScreen();
        //System.out.println("Please enter a list of integers separated by a space:");
        int[] integers = AssignmentTwo.getNewNumbers();
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
        int response = AssignmentTwo.getUserInput();
        switch(response){
            case 1:
                System.out.println(">-1");
                System.out.println(sum(integers));
                break;
            case 2:
                System.out.println(">-2");
                System.out.println(evens(integers));
                break;
            case 3:
                System.out.println(">-3");
                System.out.println(odds(integers));
                break;
            case 4:
                System.out.println(">-4");
                System.out.println(max(integers));
                break;
            case 5:
                System.out.println(">-5");
                System.out.println(min(integers));
                break;
            case 6:
                System.out.println(">-6");
                integers = AssignmentTwo.getNewNumbers();
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
    public static int sum(int[] arr){
        int summation = 0;
        for(int i = 0; i < arr.length; i++){
            summation += arr[i];
        }
        return summation;
    }
    public static String evens(int[] arr){
        String even = "";
        //System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even += arr[i];
                even += ' ';
            }
        }
        return even;
    }
    public static String odds(int[] arr){
        String odd = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                odd += arr[i];
                odd += ' ';
            }
        }
        return odd;
    }
    public static int max(int[] arr){
        int currMax = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > currMax){
                currMax = arr[i];
            }
        }
        return currMax;
    }
    public static int min(int[] arr){
        int currMin = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < currMin){
                currMin = arr[i];
            }
        }
        return currMin;
    }
}
