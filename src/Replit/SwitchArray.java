package Replit;
import java.util.Arrays;
import java.util.Scanner;

public class SwitchArray {
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int [] swap=do_switch(a);
        System.out.println(Arrays.toString(swap));
    }

/*
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */

//    public static int[] do_switch(int[] i) {
//    int [] arr={1,2,3,4};
//    Arrays.toString(arr);
//    for (int each:i){
//        each[3]=each[1];
//    }
//
//    }

    public static int[] do_switch(int[] i) {
        int j = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = j;
        return i;

    }

    }
