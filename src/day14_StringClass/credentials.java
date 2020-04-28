package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
           /*
        userName:Cybertek
        password: cubertekschool
         */
           String validUsername="cybertek";
           String validPassword="cybertekschool";
        System.out.println("Please enter your username:");
           String userName=scan.next();
        System.out.println("Please enter your password:");
           String password=scan.next();

        boolean valid=true;

        if(validUsername.equals(userName)&& validPassword.equals(password)){
            System.out.println("Login succesfull");
        }else{
            System.out.println("Invalid credentials");
        }


    }
}
