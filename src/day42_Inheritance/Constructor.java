package day42_Inheritance;

class test{

    public test(){
        System.out.println("Super class' default constructor");
    }
}


public class Constructor extends test{
    public Constructor(){
        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {
       Constructor obj= new Constructor();
       // System.out.println();
    }
}
