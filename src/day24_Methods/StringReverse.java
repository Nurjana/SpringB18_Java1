package day24_Methods;

public class StringReverse {
    public static void main(String[] args) {
        //String t= reverse("Cybertek");//reverse method
        String name =reverse2("Nurjana");//reverse 2
        System.out.println(name);
    }
    public static void reverse(String str){
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
    public static String reverse2(String str){
      String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse +=str.charAt(i);
        }
        return reverse;
    }

}
