package day48_Abstraction;
    public abstract class Phone{
        public static String brand;
        public String model;
        public double price;
        public String size;

        //sub class when extend, has to override these two methods if not abstract
        public abstract void calling(long phoneNumber);// void is a return type, it can also be a data type instead of void, like int
        public abstract void texting (long receiver);

        //instance method
        public String toString(){
           return "Brand: "+ brand+", Model: "+ model+ ", Price: $"+price+", Size: "+size;
        }
    }






/*
Warmup tasks:
  1. create an abstract class called Phone
        attributes: brand, model, price, size
abstract methods: calling(), texting()
        instance method: toString()
        2. create the following subclasses of phone:
        1. iPhone
        2. Samsung
        create constructors in each sub class that can initialize the instance variables
 */
