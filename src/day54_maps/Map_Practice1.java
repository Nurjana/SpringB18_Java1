package day54_maps;
import java.util.*;
import com.sun.javafx.collections.MappingChange;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Map_Practice1 {
    public static void main(String[] args) {
        Map<String, LocalDate> familyBday=new LinkedHashMap<>();
        familyBday.put("Papa", LocalDate.of(1961,8,20));
        familyBday.put("Mama",LocalDate.of(1961,2,18));
        familyBday.put("Janka",LocalDate.of(1982,6,18));
        familyBday.put("Beka",LocalDate.of(1987,12,13));
        familyBday.put("Janka",LocalDate.of(1982,6,18));// this will not be printed out, duplicate
        familyBday.put("Test",LocalDate.of(2020,11,15));// this will not be printed out
        familyBday.put("Test",LocalDate.of(2019,11,15));//this will execute
        familyBday.remove("Test");
        System.out.println("My family's birthdays are: "+familyBday);
        System.out.println(familyBday.size());
        boolean r1=familyBday.containsKey("Nurjana");
        System.out.println(r1);
    }
}
