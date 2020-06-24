package day52_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Yasin");
        set.add("Mihrac");
        set.add("Alisir");
        set.add("Zafer");
        set.add("Yasin");// this won't print, its duplicated

        System.out.println(set);


        String [] arr={"A","A","C","K","J","B","B"};
        LinkedHashSet<String> set1=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);


       // System.out.println(set1.get(1)); won't work, it has no index

        System.out.println("=======================");

        Set<Integer> numbers= new TreeSet<>();
        numbers.addAll(Arrays.asList(10,10,9,8,7,6,6,5,4,3,3,2,1));
        System.out.println(numbers);

    }
}
