package Replit;

import java.util.Scanner;

public class countOfWords {
    /*
   Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
                count++;
            }
        }
        System.out.println(count);
            }

        }



