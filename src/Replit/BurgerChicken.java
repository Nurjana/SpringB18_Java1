package Replit;

import java.util.Scanner;

public class BurgerChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();

        //your code here
        String burger="burger";
        String chicken="chicken";
        String soda="soda";
        if (in.equalsIgnoreCase(burger)||in.equalsIgnoreCase(chicken)){
            System.out.println(10.0);
        }else if (in.equalsIgnoreCase(soda)){
            System.out.println(2.0);
        }
    }
}