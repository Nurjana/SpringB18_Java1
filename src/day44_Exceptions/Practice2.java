package day44_Exceptions;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("Java");
        waits(2);
        System.out.println("Cybertek");
        waits(2);
    }
    public static void waits(double seconds){
        try {
            Thread.sleep((long)(seconds*2000));// assigning new big num to long, explicit casting
        }catch (Exception e){}
    }

}
