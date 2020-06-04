package day45_Exceptions;

public class ThrowsKeyword {
    public static void sleep(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){
    }
}

public static void sleep2() throws InterruptedException{
    Thread.sleep(3000);}
}