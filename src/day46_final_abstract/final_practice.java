package day46_final_abstract;

public class final_practice {
    final int a=10;
    final static int b=20;

    {
        System.out.println(a);//instance block can take instances
        //a=20; a is final and cannot be re-assigned
    }
    static {
        System.out.println(b);//will print, because b is static
       // b=20; cannot be re-assigned, its final
    }

    public final void method1(){}// method can be final

    final public  static void method2(){}// position of final doesn't matter

    class test extends final_practice{}

        //protected void method1(){} cannot override final method}

    private final int  method1(int a){return 12;} //can overload method

    public static void method2(int a){}


}
