package Replit;

import java.util.Scanner;

public class email_names_073 {
    /*
    Write a program that will print out information about the user based on email. Print first and last name from the email with the upper case. (Assume that first and last names were separated by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String name=email.substring(0,email.indexOf("_"));
        String FirstName=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();

        String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String LastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        String topLev=email.substring(email.indexOf(".")+1);

        System.out.println("First name: "+FirstName);
        System.out.println("Last name: "+LastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+topLev);

    }
}