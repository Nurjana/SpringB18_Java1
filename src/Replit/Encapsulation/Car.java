package Replit.Encapsulation;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    double topSpeed;
    double price;

    //The main constructor that can initialize all variables

    public Car (String make, String model,int numberOfDoors, double topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price; }

   //A secondary constructor that does not include numberOfDoors, which should default to 4
    public Car(String make, String model,double topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
   // A secondary constructor that does not include make and model; both default to "unknown"
   public Car(int numberOfDoors,double topSpeed,double price){
       this.make="unknown";
       this.model="unknown";
       this.numberOfDoors=numberOfDoors;
       this.topSpeed=topSpeed;
       this.price=price; }

   //A secondary constructor that does not include topSpeed or price; default to 90 and 0 respectively.
   public Car (String make, String model,int numberOfDoors){
       this.make=make;
       this.model=model;
       this.numberOfDoors=numberOfDoors;
       this.topSpeed=90;
       this.price=0;}
}
/*
Instructions from your teacher:
 1. Complete the Car.java class:

Include the following class variables:
* make
* model
* numberOfDoors
* topSpeed
* price
All class variables should be declared case sensitive

Write four constructors:
* The main constructor that can initialize all variables
* A secondary constructor that does not include numberOfDoors, which should default to 4
* A secondary constructor that does not include make and model; both default to "unknown"
* A secondary constructor that does not include topSpeed or price; default to 90 and 0 respectively.
 */