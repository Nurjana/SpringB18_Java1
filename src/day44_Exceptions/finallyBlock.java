package day44_Exceptions;

public class finallyBlock {
    public static void main(String[] args) {
       try{
           System.out.println(9/0);
           System.out.println("Try block");
       }catch (Exception e){
           String result=e.getMessage();
           System.out.println(result);
           System.out.println("Catch Block");
       }finally {
           System.out.println("Finally");
       }
       }
}
