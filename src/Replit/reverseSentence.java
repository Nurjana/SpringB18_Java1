package Replit;
import java.util.*;
public class reverseSentence {
    /*
    Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String[] words = sentence.split(" ");

       // System.out.println(Arrays.toString(words));  // [Today, is, great, day]

        for(int i = words.length-1;  i >= 0; i-- ){
            String eachWords =  words[i];
            // System.out.print(eachWords+" ");
            reversed += eachWords+" ";

        }



        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
