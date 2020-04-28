package day18_NestedLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String str="Java";
        String rev="";
        int last=str.length()-1;

        do{
           rev+= str.charAt(last);
            last--;
        }while(last>=0);
        System.out.println(rev);
    }
}
