package day42_Inheritance.Task02;
/*
create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
 */
public class TV extends Device {

    public TV(String brand, String model, double price, String type,String size){
            setDevice(brand,model,price,"TV",size);//this set is inherited from the device class
    }


    public void watch(){//method only for this device type
        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );
    }

}
