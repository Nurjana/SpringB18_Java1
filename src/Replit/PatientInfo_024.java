package Replit;

import java.util.Scanner;

public class PatientInfo_024 {
    /*
    Instructions from your teacher:


Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

-Create a Scanner object named scan.

Execution flow with example:
-Display prompt "Welcome to the patient portal!"
-Display prompt "Please enter your personal information"

-Display prompt "Enter your first name"
James

-Display prompt "Enter your last name"
May

-Display prompt "Enter your email"
jamesmay@gmail.com

-Display prompt "Enter your street"
7925 Jones Branch Dr

-Display prompt "Enter your city"
McLean

-Display prompt "Enter your state"
VA

-Display prompt "Enter your zip code"
22102

-Display prompt "Enter your work phone number"
7896542314

-Display prompt "Enter your personal phone number"
2406542314

-Display prompt "Enter your age"
35

-Display prompt "Enter your height"
5.10

-Display prompt "Enter your weight"
173.2

-Display prompt "Are you married?"
true



-build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String  firstName, lastName, fullName, email, street, state, city, address, contacts;
        int  age, zipcode;
        double  height, weight;
        boolean  isMarried =true;
        long workPhoneNumber, personalPhoneNumber;
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
            firstName=scan.next();
        System.out.println("Enter your last name");
          lastName=scan.next();
        System.out.println("Enter your email");
            email=scan.next();
        System.out.println("Enter your street");
               address=scan.next();
        System.out.println("Enter your city");
        city=scan.next();
        System.out.println( "Enter your state");
        state=scan.next();
        System.out.println("Enter your zip code");
        zipcode=scan.nextInt();

        System.out.println( "Enter your work phone number");
        workPhoneNumber=scan.nextInt();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scan.nextInt();
        System.out.println("Enter your age");
        age=scan.nextInt();
        System.out.println("Enter your height");
        height=scan.nextDouble();
        System.out.println("Enter your weight");
        weight=scan.nextDouble();

        System.out.println( "Are you married?");
isMarried=scan.nextBoolean();
        String FullName=(lastName+","+firstName);
        String Address=("Address: "+address+","+city+","+state+" "+zipcode);
        String Contacts=("work phone number -"+workPhoneNumber+",personal phone number-"+personalPhoneNumber+",email:"+email);

        System.out.println("Patient personal information");
        System.out.println(FullName);
        System.out.println(Address);
        System.out.println(Contacts);
        System.out.println("Age:"+age);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
        System.out.println("Married?:"+isMarried);

    }
}
