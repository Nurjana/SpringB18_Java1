package Replit;

import java.util.Scanner;

public class giftCard035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        int output=0;
        if (item.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase("charger")){
            output=100-15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+output+"$");
        }else if (item.equalsIgnoreCase("USB cable")){
            output=100-10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+output+"$");
        }else if (item.equalsIgnoreCase("headphones")){
            output=100-30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+output+"$");

        }else if (item.equalsIgnoreCase("pants")) {
            output = 100 - 50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + output + "$");
        }else if (item.equalsIgnoreCase("hat")) {
            output = 100 - 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + output + "$");
        }else if (item.equalsIgnoreCase("socks")) {
            output = 100 - 5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + output + "$");
        }else if (item.equalsIgnoreCase("blanket")) {
            output = 100 - 60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + output + "$");
        }else if (item.equalsIgnoreCase("pillow")) {
            output = 100 - 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + output + "$");
        }else {
            System.out.println("Invalid item!");
        }
    }
}
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.
If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message:
"Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items

 */