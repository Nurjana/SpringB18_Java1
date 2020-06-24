package day52_Collections;

import java.util.*;

public class PracticeCollections {
    String model;
    int year;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Nurjana");
        names.add("Sada");
        names.add("Huri");
        names.add("Zareen");
        names.add("Fatmana");
        //LIST WILL GIVE ME ABILITY TO ADD DATA AND RETRIEVE IT AT ANY INDEX
        System.out.println(names);
        System.out.println(names.get(3));

        //LinkedList
        List <String> students =new LinkedList<>();
        students.add("Student1");
        students.add("Student2");
        students.add("Student3");
        System.out.println(students);
        System.out.println(students.get(2));

        Set <String> handles=new HashSet<>();
        handles.add("987654");//it will automatically sort it in accending order
        handles.add("123456");
        handles.add("654321");

        handles.add("987654");// this won't be printed, because it has the same value
        System.out.println(handles);



    }
}