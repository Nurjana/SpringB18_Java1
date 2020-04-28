package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
       //pre decrement/increment
        int a =100;
        System.out.println(++a);//101 pre increment always changes the value immediately
        System.out.println(a);//101

        int b =100;
        System.out.println(--b);

        //post increment/decrement - first passes the current value, then eventually changes the variable value
        int A=100;
        System.out.println(A++);
        System.out.println(A);

            int B=100;
        System.out.println(B--);
        System.out.println(B);



    }
}
