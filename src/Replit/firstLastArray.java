package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class firstLastArray {
    /*
    Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        for (String each:words){
            String str =each.charAt(0)+""+each.charAt(each.length()-1);
            System.out.println(str);


       // for(String each:words){

            }

        }

    }
