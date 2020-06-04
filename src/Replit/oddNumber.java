package Replit;
import java.util.Scanner;
public class oddNumber {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("#1: ");
            int num1 = 3; //s.nextInt();
            System.out.print("#2: ");
            int num2 = 11;// s.nextInt();
            //start on line 11

            String odd = "";
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    odd += i;
                }
            }
            System.out.print(odd);

        }
    }

