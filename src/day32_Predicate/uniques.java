package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniques {
    //write a program that returns unique object
    public static void main(String[] args) {
        Character[] chars={'A','B','C','A','D','D'};
        ArrayList<Character> charList=new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);//[     A,B,C,A,D,D};

        ArrayList<Character> result= new ArrayList<>();//[B,C]

        for (Character each:charList){
            int count=Collections.frequency(charList,each);
            if (count==1){
                result.add(each);
            }
        }
        // with for loop
//        for (int i=0; i<charList.size();i++){
//            int count=Collections.frequency(charList,charList.get(i));
//            if (count==1){
//                result.add(charList.get(i));
//        }
//
//        }
        System.out.println(result);// prints unique character [B,C]

    }
}
