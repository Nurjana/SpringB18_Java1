package Replit.Methods;

import Replit.Replit;

public class methodRectangle {
    /*
    Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an
if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
     */
    public static void main(String[] args) {
        printHollowRect();
    }


    public static void printHollowRect() {
        // write your code here:
        int sides = 0;

        for (int j = 1; j <= 1; j++) {
            System.out.println("*****");

        }
        for (int i = 1; i <= 3; i++) {
            sides++;
            System.out.println("*   *");

        }
        for (int j = 1; j <= 1; j++) {
            System.out.println("*****");

        }}

    /*
    method I like
for(int i = 0; i < 5; i++){
    for (int j = 0; j < 5; j++){
        if(i == 0 || i == 4 || j == 0 || j == 4){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
     */
}

        // end your code



