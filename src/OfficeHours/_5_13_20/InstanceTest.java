package OfficeHours._5_13_20;



public class InstanceTest {
    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name= "Muhtar";

        Instances obj2 = new Instances();
        obj2.name = "Kuzzat";

        System.out.println( obj1.name ); //Muhtar
        System.out.println( obj2.name ); // Kuzzat


        obj1.printName(); // name is muhtar

        obj2.printName();

    }

}


class InstanceBlock {

    public static void main(String[] args) {

        Instances obj = new Instances();
        System.out.println( obj.name );

    }

}
