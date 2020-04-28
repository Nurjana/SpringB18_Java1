package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
     int []arr ={10,20, 30,40,50};
        Arrays.sort(arr);// sort accending
        System.out.println(Arrays.toString(arr));

        int [] revArr= new int[arr.length];

        int j= arr.length-1;
        for(int i=0; i<=arr.length-1; i++){
            revArr[i]=arr[j];
            j--;

        }
        System.out.println(Arrays.toString(revArr));

    }
}
