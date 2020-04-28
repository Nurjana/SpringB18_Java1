package Replit;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PrintEven_113 {
    /*
    int CountEven=0;
        for (int each : nums) {
            if (each % 2 == 0) {

            }CountEven++;
        }System.out.println(CountEven);
     */
    public static void main(String[] args) {


                int [] arr = new int [61];
                int k=0;
                for(int i=80; i>=20;i--){
                    arr[k]=i;
                    k++;
                }
                //  System.out.println(Arrays.toString(arr));
                for(int each:arr){
                    if(each%2!=0){
                        continue;
                    }else{
                        System.out.print(each+" ");
                    }
                }}}
