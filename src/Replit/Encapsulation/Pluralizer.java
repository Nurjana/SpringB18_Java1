package Replit.Encapsulation;

import java.util.Scanner;
public class Pluralizer {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:


       if(amt == 1) {
            word = amt + " " + word;
        }else if (( amt == 0 || amt > 1) && word.length() >= 1){
            if (!(word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") ||
                  word.endsWith("uy") || word.endsWith("sh") || word.endsWith("ch") ||
                  word.endsWith("fe") || word.endsWith("us") || word.endsWith("y"))) {
                word = amt + " " + word + "s";
            }
            if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                word = amt + " " + word + "s";
            }
            if (word.endsWith("sh") || word.endsWith("ch")) {
                word = amt + " " + word + "es";
            }
            if (word.endsWith("fe")) {
                word = amt + " " + word.replace("fe","ves");
            }
            if (word.endsWith("us")) {
                word = amt + " " + word.replace("us","i");
            }
            if (word.endsWith("y")){
                word = amt + " " + word.replace("y","ies");
            }
        }
        System.out.println(word);
//        return word;
    }
}


/*
 Two horses. Five monkeys. Twenty flies. One cat. Nine lives. Despite the English language being one of the most commonly used languages around the world, it is also quite complicated to learn if you are not a native speaker. Taking a noun and converting it to its plural form has a dozen rules and even more special cases.

In this project, you will be creating a program that takes a given non-negative integer and a given singular noun as a String.  You will have to print out the number, followed by the string in its plural form (unless the number is 1).

The given inputs are:
int amt;
String word;

For example, let's say your inputs are as follows:
# in: 4
word: apple
Your program should print out "4 apples"

# in: 0
word: apple
Your program should print out "0 apples"

# in: 1
word: apple
Your program should print out "1 apple" Be prepared to handle the following rules:





Note that in order to handle cases where the word ends in “y” correctly, you will need to take some care. It is important that you order your conditions so that your code will check for the special case endings of “ay”, “oy”, “ey”, and “uy” before simply checking whether a word ends in “y”.

 */