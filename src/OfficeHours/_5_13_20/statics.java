package OfficeHours._5_13_20;

public class statics {
    int instanceVariable=100;
    static int staticVariable=200;

    public static void staticMethod(){
        //instanceMethod(); won't accep, because it is not static
        System.out.println(staticVariable);
    }
public void instanceMethod(){
    // System.out.println(instanceVariable);//wont accept, its not static
    staticMethod();
    System.out.println(staticVariable);
    System.out.println(instanceVariable);
}

    public static void main(String[] args) {
        //  System.out.println( instanceVariable );
        System.out.println( staticVariable );
        staticMethod();
        //  instanceMethod();
    }
}
