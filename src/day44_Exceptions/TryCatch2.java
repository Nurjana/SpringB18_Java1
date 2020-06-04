package day44_Exceptions;

public class TryCatch2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {

            Thread.sleep(3000);
            System.out.println("Try block");//when printed out it shows only this message, meaning try cought the exception, not catch

        }catch(Exception  e){
            System.out.println("Catch block");
        }


        System.out.println("World");

    }


}
