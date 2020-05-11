package Replit;

import java.util.Arrays;

public class testNastya {
    public static void main(String[] args) {

//Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.
//
//For example, the if we run rowSums for the following 2D array:
//{
//  {1,1,2}, //sum = 4
//  {3,1,2}, //sum = 6
//  {3,5,3}, //sum = 11
//  {0,1,2}  //sum = 3
//}
//Then we should get the following array back:
//{4,6,11,3}
        //   0          1          2          3
        int[][] a = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        int[] sums = rowSums(a); // вызвали и назначили наш метод
        System.out.println(Arrays.toString(sums));

        for (int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums) {
        // Create new array that that will has the same size as original to fit there new values
        int[] summ = new int[nums.length]; // 4 [0, 0, 0, 0]
        // First loop looping first index/legth of the 2d array
        for (int k = 0; k < nums.length; k++) { // 0 => enter in int[k][] nums
            // Till first index [0], it enter inside of 2 arr and loops it's values
            for (int i = 0; i < nums[k].length; i++) { // 0 => enter in int[][i] nums
                //                       0
                summ[k] += nums[k][i];
                //   0          0  0
            }
        }
        return summ;
    }
}