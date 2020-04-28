package day05_Unary_ShorthandOperators;

public class unaryOperators {
    public static void main(String[] args) {
        /*
        +: positive
        -: negative
         */
        int a = 10; //positive 10
        int b = +a; //positive 10
        System.out.println(a);
        System.out.println(b);
        int a2 = -10;
        boolean result1 = a2>0;
        boolean result2 = a2<0;
        System.out.println(result1);
        System.out.println(result2);
        int x1 = -10;
        int y1 = -x1;
        //    -(-10) ==> +10;
        System.out.println(y1);//10
        int x2 = 20;
        int y2 = -x2;
        //  - (+20) ==> -20
        System.out.println(y2);//-20
        int x3 = +20;
        int y3 = +x3;
        //
        System.out.println(y3);//20
        /*
        --: decrement, decrease the value of the variable by 1;
        ++: increment, increase the value of the variable by 1;
         */
int z=100;
        System.out.println(++z);
        System.out.println(z);

int p=100;
        System.out.println(p++);
        System.out.println(p);

    }
}
