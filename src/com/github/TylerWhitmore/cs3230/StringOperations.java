package src.com.github.TylerWhitmore.cs3230;
import java.util.List;
import java.util.ArrayList;

public class StringOperations {
    public static List<Boolean> palindrome(List<String> str){
        List<Boolean> tf = new ArrayList<Boolean>();
        for(int i = 0; i < str.size(); i++){
            String curr = str.get(i); //holding current string
            if(curr.length() > 1){ //more than one character
                StringBuilder manipulating = new StringBuilder();
                manipulating.append(str); //add str to the manipulated variable
                manipulating.reverse(); //reverse the string
                String rev = manipulating.toString();
                if(curr.equalsIgnoreCase(rev)){
                    tf.add(true);
                }
                else{
                    tf.add(false);
                }
            }
            else{
                //one character, palindrome by default
                tf.add(true);
            }
        }
        return tf;
    }
}
