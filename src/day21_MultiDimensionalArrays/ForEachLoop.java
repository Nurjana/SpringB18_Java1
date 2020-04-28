package day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr1);//[1,2,3,4,5,6,7,8,9]
            for (int eachNum : arr1) {
                if(eachNum<5){
                    continue;
                }
                System.out.println(eachNum);
            }

        System.out.println("=============================");
            String sentence="I like Java";
           String[]words= sentence.split(" ");//[I, like, Java]
            for (String eachWord: words){//0-2

                    System.out.println(eachWord);
                }

                System.out.println("====================================");

                for(int i = words.length-1; i >= 0; i--){
                    System.out.println(words[i]);


            }



        }

    }

