package Replit;

import java.util.Scanner;

public class easyStuff {

    public static void main(String[] args) {
        //cube();
        hello();
        world();

    }

    public static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println("result:" + result);
        System.out.println("==============================");
             /*
    create a static method called "plus", its return is void and it gets no arguments.
SYste
It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
     */
    }

    public static void cube() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cube = num * num * num;
        System.out.println("input: " + num + "\noutput: " + cube);
        /*
        Given method called cube. Write all required code inside this method in order
        to asks the user for a number and then prints the cubed value of that number:

        Example:

        input: 5
        output: 125

        hint: cube of a number n = n*n*n
                */
    }


    public static void hello() {
        //WRITE YOUR CODE HERE
        System.out.println("Hello");

    }

    public static void world() {
        //WRITE YOUR CODE HERE
        System.out.println("World!");
    }

    /*
//   Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
//    */
//
//
//        for(int i=11;i<=121;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }




}