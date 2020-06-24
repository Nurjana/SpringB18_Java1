package day52_Collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();
        list1.add(1);

        List<Integer> list2=new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("==============");

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);

        Vector<Integer> vector =new Vector<>();
        vector.add(10);//actions of the vector are synchronized

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("========================");

        Stack <String> names=new Stack<>();
        names.add("Zafer");
        names.add("Alisir");
        names.add("Murtaza");
        names.add("Mehmet");
        names.add("Naci");
        System.out.println(names);

        String s1=names.pop();//Naci
        System.out.println(s1);
        System.out.println(names);
        String s2=names.pop();//mehmet
        System.out.println(names);

    }
}
