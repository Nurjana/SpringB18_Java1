package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        int num2 =scan.nextInt();
        System.out.println("Enter your third number: ");
        int num3 =scan.nextInt();
        int max = (num1>num2 && num1>num3)? num1 : (num2>=num1 && num2>=num3)? num2:num3;
        System.out.println("Maximum number is "+max);

    }

}
