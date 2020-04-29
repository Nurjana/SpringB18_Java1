package Replit;

import java.util.Scanner;

public class containsJava {
    /*
    Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count=0;

            for(int i=0;i<word.length()-3;i++){
                if (word.substring(i,i+4).equalsIgnoreCase("java")){
                    count++;
                    System.out.println(count);}

        }


    }
}