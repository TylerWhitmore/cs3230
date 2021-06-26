package src.com.github.TylerWhitmore.cs3230;
import java.util.ArrayList;

public class Calculations {
    public static int sum(int[] arr){
        int places = arr[0] + 1;
        int summation = 0;
        for(int i = 1; i < places; i++){
            summation += arr[i];
        }
        return summation;
    }
    public static ArrayList<Integer> evens(int[] arr){
        ArrayList<Integer> even = new ArrayList<Integer>();
        int places = arr[0] + 1;
        for(int i = 1; i < places; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }
        }
        return even;
    }
    public static ArrayList<Integer> odds(int[] arr){
        ArrayList<Integer> odd = new ArrayList<Integer>();
        int places = arr[0] + 1;
        for(int i = 1; i < places; i++){
            if(arr[i] % 2 != 0){
                odd.add(arr[i]);
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
