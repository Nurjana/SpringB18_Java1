package Replit;

import java.util.Scanner;

public class guestList_083 {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer;
        String result="";

        String guest;

        do{
            System.out.println("Please enter guest name:");
            guest=input.next();

            result+=guest+", ";
            System.out.println("Do you want to enter new guest name:");
            answer=input.next();
            if(answer.equalsIgnoreCase("no")){
                result=result.substring(0,result.length()-2);
                System.out.println("Guest's list: "+result);
                System.exit(0);
            }
        }while(answer.equalsIgnoreCase("yes"));}}