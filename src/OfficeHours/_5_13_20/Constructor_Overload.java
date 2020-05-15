package OfficeHours._5_13_20;


public class Constructor_Overload {

    //constructor
    public Constructor_Overload(int a){
        System.out.println("default constructor");
    }
    //the only way to get multiple constructors, is to overload them

    public Constructor_Overload(int a,double b){
        System.out.println("constructor with int and double");
    }

    public static void main(String[] args) {
        Constructor_Overload obj= new Constructor_Overload(123);
    }
}
