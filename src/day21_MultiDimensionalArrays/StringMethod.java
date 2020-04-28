package day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name="Java";
        char[] chars=name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[3]);

        String str="I like Java";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence: day great is today
         */
        String sentence ="Today is a great day";
        String[] words =sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Today is a great day]
            for(int i=words.length-1; i>=0; i--){
              String eachWord=  words[i];
                System.out.print(eachWord+" ");



            }
    }
}
