package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {
        Encapsulation obj =new Encapsulation();
        System.out.println(obj.getSSN());//0
        obj.setSSN(789456);
    }
}
