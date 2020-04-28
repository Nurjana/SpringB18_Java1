package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
//        Task: Scanner_Practice1
//        1. ask the user enter first name
//        2. ask user to enter last name
//        3. ask the user employed or not? true ==> employed, false ==> unemployed
//        4. if he is employed , ask the salary
//        4. if he is not employed set the salary to 0
//        output:
//        full name:
//        employment status:
//        salary:
        System.out.println("Please enter your first name: ");
        String firstName =scan.next();

        System.out.println("Please enter your last name: ");
        String lastName =scan.next();
        String fullName=firstName+" "+lastName;
//        System.out.println("Full name is: "+fullName);

        System.out.println("Enter employement status: employed or not employed");
        boolean emplStatus =scan.nextBoolean();

        double salary=0;
        if (emplStatus==true){
            System.out.println("Enter your salary: ");
            salary=scan.nextDouble();
        }

        System.out.println("Full name is: "+fullName);
        System.out.println("Employed: "+emplStatus);
        System.out.println("Salary: "+ salary);


    }
}
