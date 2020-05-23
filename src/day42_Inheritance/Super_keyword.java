package day42_Inheritance;

class A{
    int a=100;
    public A(double b){
        System.out.println(this.a);// will print 100
    }
}

public class Super_keyword extends A {
    int a = 200;

    public Super_keyword() {
        super(3.0);// assigned value to the parent constructor's primitive
        System.out.println(super.a);//100
    }


    public static void main(String[] args) {
     //   Super_keyword obj=new Super_keyword();
    A obj2=new A(2.0);
    }
}
