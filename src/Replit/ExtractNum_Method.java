package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtractNum_Method {
public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        extractNum(s);
        }


        public static void  extractNum(String s) {
            ArrayList<Character> number = new ArrayList<>();
            char ch = 0;
            for (int i = 0; i < s.length(); i++) {
                char num = s.charAt(i);
                if (Character.isDigit(num)) {
                    number.add(num);

                }System.out.print(num);

            }


        }}






    /*
    extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)
     */

