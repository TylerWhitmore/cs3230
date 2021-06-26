package src.com.github.TylerWhitmore.cs3230;

public class Main{
    public static void main(String[] args){
        int  argLength = args.length;
        int[] results = new int[argLength];
        for(int i = 0; i < argLength;i++){
            results[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Sum: " + Calculations.sum(results));
        System.out.println("Evens: " + Calculations.evens(results));
        System.out.println("Odds: " + Calculations.odds(results));
        System.out.println("Max: " + Calculations.max(results));
        System.out.println("Min: " + Calculations.min(results));
    }
    
}