package day14_StringClass;

import java.util.Scanner;

public class middleString {
    public static void main(String[] args) {
//        Write a Java method to display the middle character of a string
//        a) If the length of the string is even there will be two middle characters.
//        b) If the length of the string is odd there will be one middle character.
//        Input :
//        elephant
//        Output:
//        The middle character in the string: ph
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String entry = scan.nextLine();
        boolean isOdd = entry.length() % 2 == 1;
        System.out.println("isOdd: " + isOdd);
        boolean hasThreeOrMore = entry.length() >= 3;
        System.out.println("Has 3 or more: " + hasThreeOrMore);
        if (isOdd && hasThreeOrMore) {
            int length = entry.length();
            System.out.println("length: " + length);
            int mid = length / 2;
            System.out.println("mid " + mid);
            System.out.println(entry.charAt(mid));


        }
    }
}