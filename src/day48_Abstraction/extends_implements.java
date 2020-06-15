package day48_Abstraction;

interface I1{
    void method1();
}

interface I2 extends I1{
    void method2();
}

abstract class AC implements I2{
    abstract void method3();
}
//both of classes: public and abstract can extend each other

public abstract class extends_implements extends AC{// this class now has 3 methods
    //overriding them or not is optional
    //when overriding, the method's access modifier has to match class'
    //in this case all void methods have to be public void
    @Override
    public void method3(){}//overriding AC class' methods
    @Override
    public void method2(){};
    public void method1(){};
}
class testRun extends extends_implements{
    @Override
    public void method2(){}


}

