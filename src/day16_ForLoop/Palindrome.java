package day16_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your word");
        String word =scan.nextLine(); // Java
        String reverseWord ="";
        for (int i=word.length()-1;1>=0;i--){
            reverseWord += word.charAt(i);
           // System.out.println(reverseWord);
        }
      // boolean palindrome=word.equals(reverseWord);
      //  System.out.println(palindrome);

    }
}
