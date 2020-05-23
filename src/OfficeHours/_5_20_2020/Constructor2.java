package OfficeHours._5_20_2020;

class test{

    public test(String str){
    System.out.println("default"); }

    public test(int a){
    System.out.println("int"); }

    public test(double d){
    System.out.println("double"); }
}

public class Constructor2 extends test{
    public Constructor2(){
        super("Hello");//String
        System.out.println("default");
    }

    public static void main(String[] args) {
        //super("Hello")
        Constructor2 obj=new Constructor2();
    }
}
