package Replit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayList_AppendPostSum {
   public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
       ArrayList<Integer> posNum =new ArrayList<>();
       int sum =0;
       for (int i=0;i<nums.size();i++){
           if(nums.get(i)>=1){
               posNum.add(nums.get(i));
               sum+=nums.get(i);
           }
       }
       posNum.add(sum);
       return posNum;
   }

    public static void main(String[] args) {
        ArrayList<Integer> num =new ArrayList<>();
        num.add(6);
        num.add(-4);
        num.add(8);
        num.add(-3);
    //appendPosSum(num);
        System.out.println(appendPosSum(num));

    }

}
 /*
    Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets
returned should be
(4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.
     */