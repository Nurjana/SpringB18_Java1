package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExctractChars3 {
    /*
    3. write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
         USE LAMBDA
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char [] arr =str.toCharArray();
        Character [] ch= new Character[arr.length];
        for (int i=0; i<arr.length;i++){
           ch[i]= arr [i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letters=new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(p-> Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>();
        digits.removeIf(p-> Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChar= new ArrayList<>();
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println(specialChar);


    }

}
