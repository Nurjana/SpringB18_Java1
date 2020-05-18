package SelfStudy.loops;

public class reverseString {
    public static void main(String[] args) {
        String word="Nurjana";
        String reverse="";
                                //i>=0 will execute infinite time
        for (int i=word.length()-1;i>=0;i--){
            reverse +=word.charAt(i);
            // we need to assign each character of the word to a new string reverse to see the results
        }
        System.out.println(reverse);

    }
}
