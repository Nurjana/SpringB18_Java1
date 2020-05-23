package Replit;
import java.util.*;
public class fibonacci_155 {
    /*
    Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        int arr[] =new int[num+1];
     //   arr[0]=0; we do not have to declare it, because empty arr at index 0 is always 0
        arr[1]=1;// since fibonnaci starts with 0 1, we already know first is 0 by default, so assigning 1 to index 1
        for (int i=0; i<=arr.length-3;i++){
            //System.out.println(arr [i+2] +" "+ arr[i]+ arr[i+1]);
            arr [i+2] = arr[i]+ arr[i+1];
            //System.out.println(arr[i+2]+" = "+ arr[i]+" "+arr[i+1]);
        }

    }
}