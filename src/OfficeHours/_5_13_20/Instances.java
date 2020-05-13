package OfficeHours._5_13_20;

public class Instances {
    String name;// this is instance

    {
        name = "Nurjana" ;// this is instance block
    }




    public static void main(String[] args) {
        Instances obj = new Instances();
        obj.name = "Nurjana";

        System.out.println(obj.name);
    }

    public void printName(){
        System.out.println("Name is : "+this.name);
    }

}
