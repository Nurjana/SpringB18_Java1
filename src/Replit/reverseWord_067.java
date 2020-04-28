package Replit;

import java.util.Scanner;

public class reverseWord_067 {
    public static void main(String[] args) {
        /*
        Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
        If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
        Otherwise, reverse this word and print out result into the console.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if ( word.length()==5){
            for(int j=word.length()-1;j>=5;j--);
           // System.out.println(word.substring(j,j+1));
        }else if(word.length()<5){
            System.out.println("Too short!");
        }else {
            System.out.println("Too long!");
        }
        }
    }






