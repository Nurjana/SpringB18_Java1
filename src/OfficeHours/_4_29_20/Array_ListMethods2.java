package OfficeHours._4_29_20;

import java.util.ArrayList;

public class Array_ListMethods2 {
    public static void main(String[] args) {
        ArrayList<Character> list1=new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');
        list1.add('C');
        int indexNum=list1.indexOf('C');
        System.out.println(indexNum);//2, location of C in the list


    }
}
