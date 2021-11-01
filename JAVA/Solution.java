
//type counter problem - hackerrank
import java.util.Scanner;

class Result {
    public static void typeCounter(String sentence) {
        int countString = 0;
        int countInt = 0;
        int countDouble = 0;

        String[] words = sentence.split("\\s");

        for (String w : words) { 
            //this if block keeps track of count of double data type
            if (w.contains("."))
                countDouble++;

            //this else block keeps tracks of counts of int and String data types
            else{    
            //for int data type 
            for (int i = 0; i <= w.length() - 1; ++i) {
                if (w.charAt(i) >= '0' && w.charAt(i)<='9' && w.charAt(i)!='.') {
                    int j = 0;
                    j += Integer.parseInt(w);
                    if (((Object) j).getClass().equals(Integer.class)) {
                        countInt++;
                    }
                }
                break;
            }
            
            //for String data type
            if (w instanceof String) {
                countString++;
            }
            }
        }
       
            //finally printing the individual counts        
            countString = countString - countInt;
            System.out.println("string " + countString);
            System.out.println("integer " + countInt);
            System.out.println("double " + countDouble);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        Result obj = new Result();
        obj.typeCounter(sentence);

    }

}
