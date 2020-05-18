package OfficeHours2.day3_String;

import javax.sound.midi.Soundbank;

public class numberOfE {

    /*
    Return true if the given string contains between 1 and 3 'e' chars.


    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */
// method that returns String and every n's number. iterator can be i+=n
        public String everyNth(String str, int n) {
            String newWord="";
           for (int i=0; i<str.length();i+=n){
        newWord+=str.charAt(i);
    }
            return newWord;

}

/*

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
    public String deFront(String str) {
        String newWord=str.substring(2);
        if (str.charAt(1)=='b'){
            newWord="b"+newWord;
        }

        if (str.charAt(0)=='a'){
           newWord= "a"+newWord;
        }

        return newWord;
    }

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */


}
