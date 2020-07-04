package day54_maps;

import com.sun.javafx.collections.MappingChange;
import java.util.Map;

import java.util.LinkedHashMap;

public class Map_setEntry {
    public static void main(String[] args) {
        LinkedHashMap<String,String> capitalCities=new LinkedHashMap<>();//key has to be country, so it doesn't repeat, and city can be value
        capitalCities.put("Tajikistan", "Dushanbe");
        capitalCities.put("Kyrgyzstan", "Bishkek");
        capitalCities.put("East Turkistan", "Urumqi");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Pakistan","Islamabad");

        String input = "usa";
        for(Map.Entry<String, String>   each : capitalCities.entrySet()  ) {
            // System.out.println( "Capital city of" + each.getKey() + " is : " + each.getValue() );
            String countryName = each.getKey();
            String cityName = each.getValue();

            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }

        }



    }
}
