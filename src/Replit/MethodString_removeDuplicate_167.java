package Replit;

import java.util.Arrays;

public class MethodString_removeDuplicate_167 {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("BugBusters"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique = "";
        String[] arr = str.split("");//[B, u, g, B, u, s, t, e, r, s]
        System.out.println(Arrays.toString(arr));
        for (String each : arr) {
            if (!(unique.contains(each))) {
                unique += each;
            }
        }
        return unique;
    }
}




/*
 String result="";
        String arr[]=str.split("");
        for(String each:arr){
            if (!(result.contains(each))){
                result+=each;
            }
        }
        return result;
 */