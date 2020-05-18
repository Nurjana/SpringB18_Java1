package day41_Inheritance;

public class Dog extends Animal{
    //by above we copied all from animal class that compiler can see

    public void bark(){
        System.out.println(name+" is barking");// this method is for this class only and cannot be shared with Fish class
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";
        System.out.println(dog1.name);
        dog1.move();
        dog1.eat();
        dog1.bark();
        }

    }

