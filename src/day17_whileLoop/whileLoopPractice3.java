package day17_whileLoop;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class whileLoopPractice3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int i=0;
        while(i<50){
            System.out.print("*");
            i++;
        }
        System.out.println();



        int num =5;
        System.out.println("***********");
        while (num >0){
            System.out.println("*         *");
            num--;
        }System.out.println("***********");


    }
}
