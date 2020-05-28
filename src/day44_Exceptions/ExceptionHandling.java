package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str ="Cybertek";
        try{
            System.out.println(str.charAt(100));
        }catch (RuntimeException e){
            String description =e.getMessage();
            System.out.println(description);
        }
        System.out.println("=============================");




        System.out.println("Completed");
    }
}
