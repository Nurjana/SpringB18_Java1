package Replit.Methods;

import Replit.Replit;

import java.util.Arrays;
import java.util.Scanner;

public class methodsWithReturn2_157 {
    /*
      max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
     */
    public static int max(int x,int  y){
        int max=0;
        if(x>=y){
            max=y;
        }else{
            max=x;
        }
        return max;
    }}