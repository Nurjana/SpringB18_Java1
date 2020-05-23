package OfficeHours2.day4;

public class xyBalance {
    public boolean xyBalance(String str) {
        for (int i=0; i<str.length();i++){
          if (str.charAt(i)=='x'){
              if (!str.substring(i).contains("y"))return false;
          }
        }return true;

    }
}
/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */