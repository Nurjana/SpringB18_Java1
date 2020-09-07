package day54_maps_enum;

public class String_Builder_Buffer {
    public static void main(String[] args) {
        String str1="Cybertek";
        str1.concat(" School");//"Cybertek School", will create new string
        System.out.println(str1);// this will print out first version of the string
        System.out.println(str1.concat(" School"));
        System.out.println("======================");

        StringBuilder builder = new StringBuilder("Harward");
        builder.append(" School");
        System.out.println(builder);
        System.out.println("=============================");

        StringBuffer buffer = new StringBuffer("AUCA");
        buffer.append(" University");
        System.out.println(buffer);
        System.out.println("===================");

        String word="ABCD";

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(sb);

        word = sb.toString();

        System.out.println(word);


    }
}
