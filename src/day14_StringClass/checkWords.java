package day14_StringClass;

import java.util.Scanner;

public class checkWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word=scan.next();

        System.out.println("Enter second word: ");
        String word2= scan.next();

        System.out.println("Enter third word: ");
        String word3 =scan.next();

        int lenght1=word.length();
        int length2=word2.length();
        int lenght3=word3.length();

        boolean allNotSAme=lenght1 !=length2 && length2 !=lenght3 && lenght1!=lenght3;

        if(lenght1==length2&& length2==lenght3){
            System.out.println("print all words that are same lenght");
                 }else if(allNotSAme){
            System.out.println("all different lenght");
        }else{
            System.out.println("Not same nor different");
        }
    }
}
