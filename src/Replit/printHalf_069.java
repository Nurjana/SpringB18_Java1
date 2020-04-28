package Replit;

import java.util.Scanner;

public class printHalf_069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /*
        Example:
input: java
output: jaja
         */
String half=word.substring(0,word.length()/2);

        System.out.println(half.concat(half));
    }}
