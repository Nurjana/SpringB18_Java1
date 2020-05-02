package day31_BulkOperations;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDUplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,4,5,5,6,7));

        ArrayList<Integer> result= new ArrayList<>();

        for (Integer each:list){
            if(!result.contains(each)){
                result.add(each);

            }

        } System.out.println(result);
        System.out.println("=========================================");
        /*
        write a program that can remove duplicates from an array of integer
        do not use for each loop
         */

        Integer[] arr1={1,2,3,4,5,6,6,3};
        ArrayList<Integer> nonDublicates=new ArrayList<>();
        for (int i=0; i<arr1.length;i++){
            if(!nonDublicates.contains(arr1[i])){
                nonDublicates.add(arr1[i]);

            }
        }
        System.out.println(nonDublicates);

    }
}
