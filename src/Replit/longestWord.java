package Replit;

import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
        int w1=word1.length();
        int w2=word2.length();
        if(w1>w2){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }
    }
}