package Replit;

import java.util.Scanner;

public class triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        char [] ch = str.toCharArray();
        for (int i =0; i < ch.length-2; i++){
            if (ch[i]== ch[i+1] && ch[i] == ch[i+2]){
                count++;
            }
        }
        System.out.println(count);
    }
}

