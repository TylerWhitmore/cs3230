package src.com.github.TylerWhitmore.cs3230;
import java.util.ArrayList;

public class Calculations {
    public static double sum(double[] arr){
        double summation = 0.0;
        for(int i = 0; i < arr.length; i++){
            summation += arr[i];
        }
        return summation;
    }
    public static ArrayList<Double> evens(double[] arr){
        ArrayList<Double> even = new ArrayList<Double>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }
        }
        return even;
    }
    public static ArrayList<Double> odds(double[] arr){
        ArrayList<Double> odd = new ArrayList<Double>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                odd.add(arr[i]);
            }
        }
        return odd;
    }
    public static double max(double[] arr){
        double currMax = 0.0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > currMax){
                currMax = arr[i];
            }
        }
        return currMax;
    }
    public static double min(double[] arr){
        double currMin = arr[1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < currMin){
                currMin = arr[i];
            }
        }
        return currMin;
    }
    public static double mean(double[] arr){
        double sumNums = sum(arr);
        double meanNum = 0.0;
        meanNum = sumNums / arr.length;
        return meanNum;
    }
    public static double std(double[] arr){
        double stepOne = mean(arr);
        ArrayList<Double> stepTwo = new ArrayList<Double>();
        double temp;
        for (int i = 0; i < arr.length; i++){
            temp = arr[i] - stepOne;
            temp = Math.pow(temp, 2);
            stepTwo.add(temp);
        }
        double[] stepThree = stepTwo.stream().mapToDouble(i -> i).toArray();
        double stepFour = mean(stepThree);
        double answer = Math.sqrt(stepFour);
        return answer;
    }
    public static double[] fiveNum(double[] arr){
        double minimum = min(arr);
        double maximum = max(arr);
        double middle = median(arr);
        ArrayList<Double> firstHalf = new ArrayList<Double>();
        ArrayList<Double> secondHalf = new ArrayList<Double>();
        for(int i = 0; i < arr.length/2; i++){
            firstHalf.add(arr[i]);
        }
        for(int j = arr.length/2; j < arr.length; j++){
            secondHalf.add(arr[j]);
        }
        double[] Q1Before = firstHalf.stream().mapToDouble(i -> i).toArray();
        double Q1 = median(Q1Before);
        double[] Q3Before = secondHalf.stream().mapToDouble(i -> i).toArray();
        double Q3 = median(Q3Before);
        
        ArrayList<Double> answer = new ArrayList<Double>();
        answer.add(minimum);
        answer.add(Q1);
        answer.add(middle);
        answer.add(Q3);
        answer.add(maximum);
        double[] answerDouble = answer.stream().mapToDouble(i -> i).toArray();
        return answerDouble;
    }
    public static double median(double[] arr){
        double middle;
        if(arr.length % 2 == 0){ // if even number
            middle = (arr[(int)Math.floor(arr.length/2)] + arr[(int)Math.ceil(arr.length/2)]) / 2; //if length is 4 then it takes 2 and 3, adds them and divides by 2
        }
        else{ //if odd number of elements
            middle = arr[(int)Math.ceil(arr.length/2)]; //takes middle element 5/2 = 2.5 ceil(2.5) = 3 
        }
        return middle;
    }
}
