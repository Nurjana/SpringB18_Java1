package Replit;

import java.util.Arrays;

public class CombineArrays {
    public static String[] combineNames(String[] first_names, String[] last_names) {
        String [] fullName= new String[first_names.length];
        String a="";

        for (int i=0;i<last_names.length;i++ ){
            a=first_names[i]+" "+last_names[i];
            fullName [i]=a;
        }return fullName;

    }


    public static void main(String[] args)
    {
       String [] first_names ={"Nurjana","Aylin"};
       String [] last_names ={"Ashiralieva"," Jarkynbaeva"};
        System.out.println(Arrays.toString(combineNames(first_names,last_names)));
       //feel free to test code here
    }
}
/*
Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
 */
