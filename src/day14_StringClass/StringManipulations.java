package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
        String str ="I like to learn JAva. I like to watch the movie Jumanji";
        int a1 =str.indexOf("J");//returns the first matching one
        System.out.println(a1);//16

        int a2 =str.indexOf("Jum");//48
        System.out.println(a2);

        int a3= str.indexOf("I");
        System.out.println(a3);//0

        String s="I like Java, and I like reading";

        int b1 =s.lastIndexOf("I");
        System.out.println(b1);//17

        int b2= s.lastIndexOf("l");
        System.out.println(b2);//19

        String z= "I like C#, C# is cool";
        int c1=z.indexOf("C");
        System.out.println(c1);

        String x="I like Java, Java is fun, Java programming is fun";
        int d1=x.indexOf("Java is");// second J's index num
        System.out.println(d1);

        int d2=x.indexOf(",J"); //second J's index
        System.out.println(d2);

        int d3 = x.lastIndexOf("J"); // last J' index number
        System.out.println(d3);

        int d4 = x.indexOf("Java p"); // last J' index number
        System.out.println(d4);


        char ch1 =    x.charAt(26);

        System.out.println(ch1);




    }
}
