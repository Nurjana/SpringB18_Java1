package Replit;

public class test1 {
    public static void main(String[] args) {


        Integer m = new Integer(34); // Autoboxed in the Object
        long m2 = 34L;
        if (m.equals(m2)) //with equals(), the primitive is boxed
            System.out.println("equals true");
//        if (m == m2) //with ==, the wrapper is unboxed
//            System.out.println("== true");
    }
}