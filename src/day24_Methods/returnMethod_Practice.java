package day24_Methods;

import java.util.Arrays;

public class returnMethod_Practice {
   // create a function that can return the maximum numer from any given array
    public static void main(String[] args) {
    int []arr ={9,1,2,87,456,15,1};
    int max =maxNumber(arr);
        System.out.println(max);//return max number
        minNum(arr);
        System.out.println(minNum(arr));// return min number

    }

    public static int maxNumber (int []arr){
        Arrays.sort(arr);

        return arr[arr.length-1];

    }
    public static int minNum(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    }


