package OfficeHours._5_20_2020;
class
Data{
    int a=100;

    public void method(){
        System.out.println("Hello World");
    }
}





public class Super_keyword extends Data{
    int a=200;
    public void method(){
        System.out.println("hello Cybertek");
    }
    public Super_keyword(){
        method();// if to call just method-it will print hello cybertek,
        // if I add super.method it will print parent class' method
        System.out.println(super.a);// this will print 100 from super class' int variable
    }

    public static void main(String[] args) {
        Super_keyword obj=new Super_keyword();// this will run hello Cybertek
    }
}
