package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalcultaor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        System.out.println("Enter your full name: ");
        String name = scan.next();

        System.out.println("Enter your company name: ");
        String company = scan.next();

        System.out.println("Enter your SSN: ");
        int ssn =scan.nextInt();

        System.out.println("What is your job title: ");
        String title = scan.nextLine();
    }
}
