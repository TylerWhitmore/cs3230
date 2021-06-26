package src.com.github.TylerWhitmore.cs3230;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
        boolean isString = false;
        int response;
        boolean cont;
        while(true){
            System.out.println("Tyler Whitmore - Assignment 3")
            System.out.println("Top Menu");
            System.out.println("1. Math Menu");
            System.out.println("2. String Menu");
            System.out.println("3. Exit");
            response = CLI.getUserInput();
            clearScreen();
            switch(response){
                case 1:
                    System.out.println(">-1"); //isString will be false, will move to math menu
                    break;
                case 2:
                    System.out.println(">-2");
                    isString = true;    //isString will be true, will move to string menu
                    break;
                default:
                    System.out.println(">-3");
                    System.out.println("Close Program?:\n1 - yes\n2 - no");
                        response = CLI.getUserInput();
                        if(response == 1){
                            System.exit(0);
                        }
                        else{
                            break;
                        }
            }
        if(isString == false){ //math section
            cont = true;
            double[] integers = CLI.getNewNumbers();
            while(cont){
                System.out.println("Current list of integers:" + Arrays.toString(integers));
                System.out.println("Choose and operation:");
                System.out.println("1. Sum - adds all the integers");
                System.out.println("2. Evens - finds all the evens");
                System.out.println("3. Odds - finds all the odds");
                System.out.println("4. Max - finds the largest integer");
                System.out.println("5. Min - finds the smallest integer");
                System.out.println("6. Mean - finds the average");
                System.out.println("7. Standard Deviation - finds the standard deviation");
                System.out.println("8. 5 Number Summary - min, Q1, median, Q3, max");
                System.out.println("9. Update - enter a new list of integers");
                System.out.println("0. Exit");
                response = CLI.getUserInput();
                clearScreen();
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
                        System.out.println(Calculations.mean(integers));
                        break;
                    case 7:
                        System.out.println(">-7");
                        System.out.println(Calculations.std(integers));
                        break;
                    case 8:
                        System.out.println(">-8");
                        System.out.println(Calculations.fiveNum(integers));
                        break;
                    case 9:
                        System.out.println(">-9");
                        integers = CLI.getNewNumbers();
                        break;
                    default:
                        System.out.println(">-0");
                        cont = false;
                        System.out.println("Close Program?:\n1 - yes\n2 - no");
                        response = CLI.getUserInput();
                        if(response == 1){
                            System.exit(0);
                        }
                        else{
                            break;
                        }
                    }
            }
        }
        else{ //string section
            cont = true;
            List<String> listOfStrings;
            while(cont){
                System.out.println("1. Palindrome - are the strings the same in reverse");
                System.out.println("2. Back to main - goes back to the main menu");
                System.out.println("3. Exit");
                response = CLI.getUserInput();
                switch(response){
                    case 1:
                        System.out.println(">-1");
                        listOfStrings = CLI.getStrings();
                        System.out.println(StringOperations.palindrome(listOfStrings));
                        break;
                    case 2:
                        System.out.println(">-2");
                        cont = false;
                        clearScreen();
                        break;
                    default:
                        System.out.println(">-3");
                        cont = false;
                        System.out.println("Close Program?:\n1 - yes\n2 - no");
                        response = CLI.getUserInput();
                        if(response == 1){
                            System.exit(0);
                        }
                        else{
                            break;
                        }
                }
            }
        }
    }

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}