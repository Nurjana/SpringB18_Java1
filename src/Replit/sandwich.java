package Replit;

import java.util.Scanner;

public class sandwich {
    /*A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

            Example:
    input: breadjambread
    output: jam

    Example:
    input: xxbreadjambreadyy
    output: jam

    Example:
    input: xxbreadapple
    output: nothing

    Example:
    input: breadbutterbread
    output: butter
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count =0;

        for(int i=0;i<str.length()-4;i++){
            if(str.substring(i,i+5).equals("bread")){
                count++;
            }
            }

        if(count<=2&&count>2){
            System.out.println("nothing");
        }else {
            System.out.println(str.substring(str.indexOf("d")+1, str.lastIndexOf("b")));

        }


    }

}
