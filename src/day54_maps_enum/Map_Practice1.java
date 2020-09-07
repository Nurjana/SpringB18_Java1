package day54_maps_enum;
import java.util.*;

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

        LinkedHashMap<String, LocalDate>  classMates = new LinkedHashMap<>();  //"Muhtar"
        classMates.put("Taha" , LocalDate.of(1998, 07, 16) );
        classMates.put("Anil", LocalDate.of(1453,01,01));
        classMates.put("Saban", LocalDate.of(1900, 01, 30));
        classMates.put("Anna", LocalDate.of(1990,2,28));
        classMates.put("Namik", LocalDate.of(1453,01,01));
        classMates.put("Yucel", LocalDate.of(2005, 12, 28));

        classMates.put("Namik", LocalDate.of(1990, 4, 5));
        classMates.put("Anil", LocalDate.now());

        System.out.println(classMates);

        classMates.remove("Anil");
        System.out.println(classMates);

        System.out.println( classMates.get("Namik") );



        boolean r2 =  classMates.containsValue( LocalDate.of(1990,4,5) );
        System.out.println(r2);


        classMates.clear();
        System.out.println(classMates);

        System.out.println("=======================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for( String eachKey   : students.keySet()  ){
            int eachValue = students.get(eachKey);  // score

            if( eachValue < 90){
                badStudents.put(eachKey, eachValue );
            }else{
                goodStudents.put(eachKey, eachValue );
            }
        }


        System.out.println(badStudents);
        System.out.println(goodStudents);







    }
}
