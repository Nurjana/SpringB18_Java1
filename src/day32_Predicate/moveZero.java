package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZero {
    public static void main(String[] args) {
        //Colle
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(10,0,20,0,30,0,40,0,50,0,60));
        System.out.println(list);// will print above

        int count = Collections.frequency(list,0);
        System.out.println(count);// will print count of 0

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for (int i=0; i<count;i++){
            list.add(0);
        }
        System.out.println(list);
    }
}
