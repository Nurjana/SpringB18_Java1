package Replit;

import java.util.Scanner;

public class loopPractice {
    public static void main(String[] args) {
//        int k=1;
//        for(int i=k;i<50;i++){
//            System.out.print("#");
//       }
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.println(txt.substring(0, txt.length() - 1));
        }
    }

