package Replit;

import java.util.Scanner;

public class carFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;


        if(model.toLowerCase()=="extravagant"&&year>=2010&&year<=2012){

            System.out.println(!recalled);

        }else if(model.toLowerCase()=="Guzzler"&&year>=2015&&year<=2018){
            System.out.println(!recalled);

        }else System.out.println(recalled);

    }
}