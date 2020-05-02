package Replit;

import java.util.Scanner;

public class EqualsJavaPython {
    /*
    Given a string, print out true if the number of appearances of "java"
    anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence.toLowerCase();
        int countJava=0;
        int countPython=0;

        for(int i=0;i<sentence.length()-3;i++){
            if (sentence.substring(i,i+4).equalsIgnoreCase("java")){
                countJava++;
            }
        for(int j=0;j<sentence.length()-5;j++ ){
            if (sentence.substring(j,j+6).equalsIgnoreCase("python")){
                countPython++;
            }
        }

        }if (countJava!=0&&countPython!=0&&countJava==countPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }}