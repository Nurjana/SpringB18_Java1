package Replit.Methods;

import java.util.Arrays;

public class palindromeNum {
    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
       String num1=""+num;
       String num2="";
       for (int i=num1.length()-1;i>=0;i--){
           num2+=num1.charAt(i);
       }
       if (num1.equals(num2)){
           System.out.println(true);
       }else {
           System.out.println(false);
       }

/*
        public static void isPalindrome1(int number){
            //TODO
            int len = Integer.toString(number).length();
            int[] arr = new int[len];
            int j = 0;
            while (number != 0) {
                arr[j] = number % 10;
                number = number / 10;
                j++;
            }

            int rev[] = new int[arr.length];
            int k=arr.length-1;

            for (int i = 0; i <arr.length; i++) {
                rev[i] = arr[k];
                k--;

            }

            boolean result= Arrays.equals(arr,rev);
            System.out.println(result);
} */
    }}


/*
Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */