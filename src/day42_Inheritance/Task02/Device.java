package day42_Inheritance.Task02;

public class Device {
    public String brand;
    public String model;
    public double price;
    public static String country;
    public String type;
    public String size;



    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Type: "+type+", size: "+size+", Price: $"+price+", Made in: "+country;
    }

    public void setDevice(String brand, String model, double price, String type,String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;
        this.size=size;
    }



}
/*
task02:
		creata a class called device:
				attributes: brand, model, price, country
				methods: toString
		create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
		create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */