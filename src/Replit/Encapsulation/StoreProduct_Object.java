package Replit.Encapsulation;

public class StoreProduct_Object {
    public static void main(String[] args) {
        StoreProduct prod1=new StoreProduct("milk",5,"misc",false,10);

        StoreProduct prod2=new StoreProduct("chocolate",3);
        StoreProduct prod3=new StoreProduct("bread",2,"bakery",true);
        StoreProduct prod4 =new StoreProduct("meat",10,50);
        StoreProduct prod5=new StoreProduct("oats",5,"non perishable",false,50);

        prod2.expired(true);
        System.out.println(prod2.toString());

    }
}
