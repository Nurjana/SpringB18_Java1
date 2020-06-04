package Replit.Overriding;

import java.util.Scanner;

public class printUnique_153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        String unique = "";

//        for (String each:words) {
//            int count = 0;
//            for (String each2 : words) {
//                if (each.equalsIgnoreCase(each2)) {
//                    count++;
//                }
//                if (each2 == 1) {
//                    System.out.println(unique);
//                }
//            }
//        }}}

    }}

/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */