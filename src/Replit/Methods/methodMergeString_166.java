package Replit.Methods;

import Replit.Replit;

public class methodMergeString_166 {
    public static String mergeStrings(String one, String two) {
        String merge = "";

        for (int i=0; i< one.length()||i<two.length();i++){
            if (i<one.length()){
                merge+=one.charAt(i);
            }if (i<two.length()){
                merge+=two.charAt(i);
            }
        }
        return merge;
    }}





    /*
    When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.
Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
     */
//    public static String mergeStrings(String one, String two) {
//       String result ="";
//       int length=0;
//       if ((one.length()>two.length()){
//        for (int i = 0; i < one.length() - 1; i++) {
//            length+=i;
//        }
//            for (int j = 0; j <= two.length(); j++) {
//            //    char ch=new char[];
//
//
//            }
//        }
//
//    }
//}



