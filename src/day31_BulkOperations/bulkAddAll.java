package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkAddAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        //add 30,20,40,50,45,35,200
//        list1.add(30);
//        list1.add(20);
//        list1.add(50);
//        list1.add(45);
//        list1.add(35);
//        list1.add(200);
//        Intiger [] arr1 ={30,20,40,50,45,35,200};
//        list1.addAll(Arrays.asList(arr1));
    Integer []arr1={30,20,40,50,45,35,200};
    list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);//    {30,20,40,50,45,35,200};

        System.out.println("=====================");
        String [] names ={"Aylin", "Amir", "Askat", "Nurjana"};
        //names[5]="Baby";// this won't be added, as a.m Array has only 4 elements, 5th element will be out of bond
        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));// this will return collection type of data
        nameList.add("baby");
      //  nameList.remove("baby");
        System.out.println(nameList);

        System.out.println("=====================");
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList = new ArrayList<Integer>( Arrays.asList(numbers) );


        System.out.println(numList);


    }
}
