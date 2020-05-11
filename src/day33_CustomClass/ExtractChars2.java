package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars2 {
    public static void main(String[] args) {
        /*
    3. write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA
        USING FOR LOOPS
     */

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters=new ArrayList<>();
        ArrayList<Character> digits=new ArrayList<>();
        ArrayList<Character> specialChar= new ArrayList<>();

        for (int i=0; i<str.length();i++){
            char each=str.charAt(i);
            //System.out.println(each);// will print out all the characters in the list
            if( Character.isLetter(each) ){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChar.add(each);
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);
        }

    }

