package day44_Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

       try {
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println(9/0);// if it catches this exception, anything below will no execute
            System.out.println("Java");
        }catch (Exception e){
           System.out.println();
       }


    }
}
