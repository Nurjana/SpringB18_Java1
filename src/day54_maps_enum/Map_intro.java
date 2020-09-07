package day54_maps_enum;


import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_intro {
    public static void main(String[] args) {
        Map<String,Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Askat", 150000.00);//put () inserts key and value
        employeeInfo.put("Nurjana",120000.00) ;

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());//{Askat=150000.0, Nurjana=100000.0} and 2

        System.out.println("Salary of Askat is $"+ employeeInfo.get("Askat"));// providing index number

        System.out.println();

        Map<String, LocalDate> familyBday=new LinkedHashMap<>();
        familyBday.put("Papa", LocalDate.of(1961,8,20));
        familyBday.put("Mama",LocalDate.of(1961,2,18));
        familyBday.put("Janka",LocalDate.of(1982,6,18));

}
}
