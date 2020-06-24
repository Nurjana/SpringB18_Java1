package Replit.Methods;

public class UniqueWords_153 {
    public static void printUniqueWords(String [] words){
        for (String eachWord:words){
            int count=0;
            for (String each:words){
                if (eachWord.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(eachWord);
            }
        }
    }
}
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */