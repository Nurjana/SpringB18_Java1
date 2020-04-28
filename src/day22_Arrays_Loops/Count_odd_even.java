package day22_Arrays_Loops;

import java.util.Arrays;

public class Count_odd_even {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,11};
        int coundOddNumber =0;
        int countEvenNumber=0;
        for(int each:arr){
            if(each %2!=0){
                coundOddNumber++;
            }else {
                countEvenNumber++;
            }
        /*
        OTHER APPROACH
        if(each%2==0){
        countEvenNumber++;
        continue;
         */
        }System.out.println("even numbers:"+ countEvenNumber);
        System.out.println("odd number: "+coundOddNumber);
    }
}
