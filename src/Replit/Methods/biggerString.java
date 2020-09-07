package Replit.Methods;

public class biggerString {
    /*
 the method gets two strings and return the longest one

 biggerS("apple","orange") ==> "orange"
  */
    public static String biggerS(String a ,String b) {
       if (a.length()>b.length()){
        return a;
    }else {
           return b;
       }
}


    public static String removeFirst(String target) {

    return target.substring(1);

    }



/*
The method gets a string and returns a string minus the first letter.

for example:

removeFirst("aaa")
returns "aa"
 */
}
