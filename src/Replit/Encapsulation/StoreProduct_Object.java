package Replit.Encapsulation;

import javax.sound.midi.Soundbank;

public class StoreProduct_Object {
    public static void main(String[] args) {
        StoreProduct prod1 =new StoreProduct("meat",10,"meats");
        System.out.println(prod1);
        StoreProduct prod2=new StoreProduct("milk",4);
        System.out.println(prod2);
        StoreProduct prod3=new StoreProduct("Choco",3,"candies",true);
        System.out.println(prod3);
        StoreProduct prod4=new StoreProduct("chips",1,"snacks",true,5);
        System.out.println(prod4);


        System.out.println("=====================");
        prod4.sale(6);
        System.out.println(prod4.toString());

    }
}
