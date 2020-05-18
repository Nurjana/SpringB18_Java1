package Replit.Methods;

import Replit.Replit;

public class MethodsWithString_169 {

    public static int wordCount(String words) {
      int totalWords=0;
       String [] split =words.split(" ");
      totalWords=split.length;
        return totalWords;
    }

    }


/*
 String sentence = "I like to learn java";

        String[] words =  sentence.split(" "); // [I, like, to, learn, java]

        System.out.println( Arrays.toString(words) );

        int totalWords = words.length;
        System.out.println(totalWords);

        String result= "";
 */