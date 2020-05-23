package day42_Inheritance;

class B{
    public B(int a){
        System.out.println("int"); }
    public B(double a){
        System.out.println("double"); }
    public B(long a){
        this(4.5);//double
        System.out.println("long"); }
}



public class InheritanceReview extends B{
    public InheritanceReview(String a){
        super(19L);//long
        System.out.println("String");//string
    }

    public static void main(String[] args) {
        InheritanceReview obj=new InheritanceReview("Hello");//double, long, String will be printed
        //because child called parent constructor long, and long has this(double) in it. and child class has
        //String...
    }
}
