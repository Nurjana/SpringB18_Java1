package Replit;

import java.util.Scanner;

public class SecondsConverter_032 {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner input = new Scanner (System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();
        int hours,minutes,seconds;
        hours=inputSeconds/3600;
        minutes=(inputSeconds-hours*3600)/60;
        seconds=(inputSeconds-(hours*3600+minutes*60));
        System.out.println(hours+" hours, "+minutes+ " minutes, and "+seconds+" seconds");

    }
}