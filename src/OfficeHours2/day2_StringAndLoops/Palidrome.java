package OfficeHours2.day2_StringAndLoops;

public class Palidrome {
    public static boolean isPalindrome (String str) {
        //racecar
        for (int j=0; j< str.length();j++){
            if(str.charAt(j)!=str.charAt(str.length()-1-j)){
                return false;
            }
        }return true;
    }

}
