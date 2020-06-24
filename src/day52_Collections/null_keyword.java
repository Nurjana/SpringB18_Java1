package day52_Collections;

import day48_Abstraction.Interface_intro;

import java.util.ArrayList;

public class null_keyword {
    static String str;//==null
    static ArrayList<Integer> list1;//also null

    public static void main(String[] args) {
        //System.out.println(str.charAt(0));//NullPointerException
        //System.out.println(list1.get(1)); same exception, as its null be default

        String str2=null;
        Integer i1=null;
        //int num=null; can't coz its primitive

        ArrayList<String> list1=new ArrayList<>();
        list1.add(null);

        System.out.println(list1);

        System.out.println("=====================");
        //String number =null;
        //int num1=Integer.parseInt(number);//wrapping
        //System.out.println(num1);// will throw exception NumberFormatException: null

        System.out.println("===========================");
        String [] arr={null, "Cybertek",null};
       // System.out.println(arr);
       // arr[2].toUpperCase();

        String name1="cybertek".toUpperCase();
        System.out.println(name1);
    }

}
