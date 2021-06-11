package src.com.github.TylerWhitmore.cs3230;

public class AssignmentOne{
    public static void main(String[] args){
        int  argLength = args.length;
        int[] results = new int[argLength];
        for(int i = 0; i < argLength;i++){
            results[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Sum: " + sum(results));
        System.out.println("Evens: " + evens(results).toString());
        System.out.println("Odds: " + odds(results));
        System.out.println("Max: " + max(results));
        System.out.println("Min: " + min(results));
    }
    public static int sum(int[] arr){
        int places = arr[0] + 1;
        int summation = 0;
        for(int i = 1; i < places; i++){
            summation += arr[i];
        }
        return summation;
    }
    public static String evens(int[] arr){
        int places = arr[0] + 1;
        String even = "";
        for(int i = 1; i < places; i++){
            if(arr[i] % 2 == 0){
                even += arr[i];
                even += ' ';
            }
        }
        return even;
    }
    public static String odds(int[] arr){
        int places = arr[0] + 1;
        String odd = "";
        for(int i = 1; i < places; i++){
            if(arr[i] % 2 != 0){
                odd += arr[i];
                odd += ' ';
            }
        }
        return odd;
    }
    public static int max(int[] arr){
        int places = arr[0] + 1;
        int currMax = 0;
        for(int i = 1; i < places; i++){
            if(arr[i] > currMax){
                currMax = arr[i];
            }
        }
        return currMax;
    }
    public static int min(int[] arr){
        int places = arr[0];
        int currMin = arr[1];
        for(int i = 1; i < places; i++){
            if(arr[i] < currMin){
                currMin = arr[i];
            }
        }
        return currMin;
    }
}