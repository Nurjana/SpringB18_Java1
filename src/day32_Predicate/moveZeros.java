package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
/*
  /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT decleare  any extra lists
     */

public class moveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5,0,6));
        System.out.println(list);//prints all above as an Array
        int count=0;
        for (int each:list){
            if (each==0){
                 count++;
            }
        }System.out.println(count);//counted we have 5 zeros
        list.removeAll(Arrays.asList(0));// this will remove all zeros in the array
        System.out.println(list);//[1,2,3,4,5,6]

        for (int i=0; i<count;i++){
            list.add(0);                //adding 0's to the end of the Array. number of 0 = to number of counted zeros above

        }
        System.out.println(list);// will print all zeros at the end

    }
}
