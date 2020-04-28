package Replit;
import java.util.*;
public class MiddleThree_065 {
    /*
    You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
     */

    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    int count=word.length();

    if (count%2!=0&& count>5){
        System.out.println(word.substring(count/2-1,count/2+2));
    }else {
        System.out.println("invalid");
    }



}
}