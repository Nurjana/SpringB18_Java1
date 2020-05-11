package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Duplicates2 {
    public static void main(String[] args) {


    ArrayList<String>  list =new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","A","D"));
        ArrayList<String> result=new ArrayList<>();


        for (int i=0; i<list.size();i++){
            int count=Collections.frequency(list,list.get(i));
            if (count>1){
                //result.add
            }
        }

        /* FIrst approach
  for (String each:list){

        int count= Collections.frequency(list,list.get(0));
        if (count>1){
            if (result.contains(each)){
                continue;
            }
            result.add(each);
    }
}
        System.out.println(result);
         */
    }}