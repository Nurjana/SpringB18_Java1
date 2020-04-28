package day22_Arrays_Loops;

import java.util.Arrays;

public class nestedForEach {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};

        for (int each :arr){
            System.out.println(each);//1,2,3,4
        }
        int [][] arr2D={{1,2,3},{4,5,6}};
        for(int [] each1Darray: arr2D){
            for (int eachElement:each1Darray){
                System.out.println(eachElement);//1,2,3,4,5,6,
            }
        }
        System.out.println("===========================");
        char [][] ch2D={{'A','B'}, {'C','D','E'}};
        for (char[] each1Darr: ch2D){
            //System.out.println(Arrays.toString(each1Darr));[A,B],[C,D,E]
            for( char eachElement  : each1Darr){

                System.out.println(eachElement);//ABCDE
        }
    }
}}
