package day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int [] arr1D={1,2,3};
        System.out.println(Arrays.toString(arr1D));//[1,2,3]
        int [][] arr2D={{1,2,3},{4,5,6}};
        System.out.println( Arrays.deepToString(arr2D));//[1,2,3],[4,5,6]

        int [][][] arr3D={{ {1,2,3},{4,5,6}},  {{7,8,9},{10,11,12}}};
        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][1]));


    }
}
