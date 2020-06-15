package Replit;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        //TODO: Write your code below.
        int decimalValue = 0;
        int bit = 128;
        for (int each : binary) {
            if (each == 1)
                decimalValue += bit;
            bit = bit / 2;
        }
        System.out.println(decimalValue);
    }
}
