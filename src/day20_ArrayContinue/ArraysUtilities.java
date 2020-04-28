package day20_ArrayContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        String r = Arrays.toString(arr);
        System.out.println(r);
        System.out.println(arr);// Array Must be converted to String before we print;
        String names[] = {"Askat", "Nurjana", "Aylin", "Amir" };
        System.out.println(Arrays.toString(names));
        double[] nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]+1);
    }
}
