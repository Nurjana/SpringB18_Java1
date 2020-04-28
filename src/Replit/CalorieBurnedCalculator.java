package Replit;

import java.util.Scanner;

public class CalorieBurnedCalculator {
    /*
    In this problem you need to write a program that checks for the bigger of 3 numbers.

You are given 3 int variables: num1 , num3 and num3.

if num1 is biggest - output: "n1 is bigger"
if num2 is biggest - output: "n2 is bigger"
if num3 is biggest - output: "n3 is bigger"


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("n1 is bigger");
        }else if(num2>num1&&num2>num3){
            System.out.println("n2 is bigger");
        }else{
            System.out.println("n3 is bigger");
        }
    }
    */

    /*
     One way to measure the amount of energy that is expended during exercise is to use metabolic equivalents (MET).
Here are some METS for various activities:
- Running 6 MPH: 10 METS
- Basketball: 8 METS
- Sleeping: 1 MET
METS are given per minute.

The number of calories burned per minute may be estimated using the following formula:
cal = 0.0175 * MET * Weight in kilograms

Write a program that asks user to enter his weight in pounds, and then calculates and outputs the total number of calories burned for a  person who runs 6 MPH for 30 minutes, plays basketball for 30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
use (int)cal to round a double value.
Example:

output: Enter weight in pounds:
input: 150
output: Calories Burned: 1073
     */
    public static void main(String[] args) {
        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter weight in pounds:");
        int sleep=360;
        int run=300;
        int basket=240;
        int met=sleep+run+basket;double weight1=scan.nextDouble();
        int calorie= (int) (0.0175*(weight1/2.2)*met);

        System.out.println("Calories burned:" +calorie);
    }}