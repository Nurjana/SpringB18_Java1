package day39_AccessModifier;

public class Test {
    public static void main(String[] args) {

    AccessModifiers obj1=new AccessModifiers();
        System.out.println(obj1.defaultAccess);
        System.out.println(obj1.publicAccess);
      //  System.out.println(obj1.SSN); wont let us use private variable froma  different class
}
 }
