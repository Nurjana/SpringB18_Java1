package day43_MethodOverriding;

class Test {
    public void method(){
        System.out.println("Onur");
    }
}

    public class MethodOverriding extends Test{
    public void method(){
        System.out.println("Zarina");//overriding parent class' method Onur->Zarina
    }
    public static void main(String[] args) {
        Test object1=new Test();// creating object in same class
        object1.method();//Onur

        MethodOverriding obj2=new MethodOverriding();//creating method using sub class
        obj2.method();//Onur

    }
}
