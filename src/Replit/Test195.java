package Replit;

import java.util.Arrays;

public class Test195 {
    public static boolean isAnagram(String word1, String word2) {
        word1.replace(" ", "");
        word2.replace(" ", "");
        char[] ch = word1.toCharArray();
        char[] c = word2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        String str = Arrays.toString(ch);
        String st = Arrays.toString(c);
        boolean b = str.equalsIgnoreCase(st);
        return b;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("earth", "heart"));
    }
}
