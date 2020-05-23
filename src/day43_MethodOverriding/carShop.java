package day43_MethodOverriding;

public class carShop {
    public static void main(String[] args) {
        Tesla tesla1=new Tesla();
        ((Tesla) tesla1).start();

        System.out.println("========================");
        Honda honda1=new Honda();
        honda1.start();

        System.out.println("========================");
        Jeep jeep=new Jeep();
        jeep.start();

        System.out.println("========================");
        BMW bmw=new BMW();
        bmw.start();
    }
}
