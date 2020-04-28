package Replit;

import java.util.Scanner;

public class ShoppingList1 {
    public static void main(String[] args) {

        /*
        Instructions from your teacher:
In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)


-calculate totalPrice for all items only if the item's count is more than 0!

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"

         */
//        System.out.println("Enter Item1, count and its price:");
//        System.out.println("Enter Item1 and its price:");
//        String item1 =scan.next();
//        double price1=scan.nextDouble();
//
//        System.out.println("Enter Item2 and its price:");
//        String item2=scan.next();
//        double price2=scan.nextDouble();
//
//        System.out.println("Enter Item3 and its price:");
//        String item3=scan.next();
//        double price3=scan.nextDouble();
//
//        double totalPrice=price1+price2+price3;
//        String report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+
//                ", Item3: "+item3+" Price: "+price3;
//        System.out.println(report);
//        System.out.println("Total price: "+totalPrice);
//        System.out.println("Enter Item2, count and its price:");
//        String item2 = scan.next();
//        double a2 = scan.nextDouble();
//        int b2 = scan.nextInt();
        Scanner scan = new Scanner(System.in);
        String item1, item2, item3, report;
        double price1, price2, price3;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();



            if(price1>0 && price2>0 && price3>0){
                double totalPrice=price1+price2+price3;
                System.out.println(totalPrice);
            }
            if(count1>0||count2>0||count3>0){
                report=item1 + "Price: "+price1+","+item2+ "Price: "+item2+","+item3;
            }



            }
        }
