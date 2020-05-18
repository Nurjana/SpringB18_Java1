package Replit.Methods;

import Replit.Replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Method_printUniqueNum {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for (int i = 0; i < size; i++) {
//            nums[i] = scan.nextInt();
//        }
        int[] nums = {1, 2, 1, 3, 4, 5, 6};
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        int count = 0;
     for (int each:nums){
         count=0;
         for (int each1:nums){
             if (each==each1){
                 count++;
             }
         }if (count==1){
             System.out.println(each);
         }
     }

    }

}
/*
Instructions from your teacher:
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34


 */