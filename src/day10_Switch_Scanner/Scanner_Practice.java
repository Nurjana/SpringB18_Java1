package day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary =input.nextInt();
        System.out.println("How many hours a week do you work: ");
        int hours = input.nextInt();
        double WeeklyRate = salary/52;
        double HourlyRate = WeeklyRate/hours;
        System.out.println("Your hourly rate is: "+HourlyRate);

    }
}
