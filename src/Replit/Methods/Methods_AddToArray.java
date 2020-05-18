package Replit.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_AddToArray {

        public static void add_to_r(int[] r,int n)
        {
            //create new array with one more position.
            int [] newArr= new int [r.length+1];// this willl create a new array plus one index

            for (int i=0; i<=r.length;i++) {// this will go over each number of the array
                newArr[i] = r[i];//this will assign old array's numbers to newly created array
            }
            newArr[r.length-1]=n;//here we are adding n to the last index of newly created array, that already has values of the r
            System.out.println(Arrays.toString(newArr));
        }



        public static void main(String[] args) {


            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt(),n = inp.nextInt();
            int[] arr = new int[size];
            for(int i=0 ;i<=size-1;i++)
            {

                arr[i]=inp.nextInt();
            }

           add_to_r(arr, n);


        }
    }

/*
add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */