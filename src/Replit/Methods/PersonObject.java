package Replit.Methods;

import java.util.Scanner;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Jane","Ash",8,17,1988,"789456");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter SSN: ");
        String personSSN = scan.nextLine();
//        System.out.println(person1.getBirthday());
        System.out.println(person1.verifySSN(personSSN));
    }
}
