package day47_Abstraction;

abstract class A{
    public abstract void method1();}

public class Abstract_vs_nonAbstract2 extends A {//mandatory to override the abstract method
    public void method1(){}
}

abstract class B extends A{
    //optional to override the abstract method of A
    //one abstract and one instance method
    //public abstract void method1();}
}
class C extends B{
    public void method1(){}// B inherited A's abstract and it has to be ovewrriden in C
}
