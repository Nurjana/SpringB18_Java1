package Replit;

import static Replit.Methods.methodMergeString_166.mergeStrings;

public class testPage {
    public static void main(String[] args) {
        String s =mergeStrings("wooden","spoon");
        System.out.println(s);

        System.out.println("===========");

        String s1 ="Bugbusters";
        String unique="";
        int count=0;
        for (int i=0;i<s1.length();i++){
            count++;
            if (count==1){
                System.out.println();
            }
        }


    }
}
