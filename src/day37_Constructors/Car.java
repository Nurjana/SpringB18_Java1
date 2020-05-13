package day37_Constructors;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand,String model,int year, double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public String toString(){
        return year+" "+brand+" "+model+ " "+ price;
    }

    //Car object class
    public static void main(String[] args) {
    Car car1=new Car("Mercedes","GL450",2019,45000 )    ;
        System.out.println(car1);
        System.out.println(car1.model);

    Car car2 =new Car("Lexus","GX",2020,50000);
        System.out.println();
    }
}
