package day14_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str=" ";
        boolean bool1=str.isEmpty();
        System.out.println(bool1);

        String username ="";
        if(username.isEmpty()){
            System.out.println("Please enter your username: ");
        }
        String s1 ="Cat";
        String s2 =new String("Cat");

        System.out.println(s1==s2);//false, different memeroy locations, different objects

        System.out.println(s1.equals(s2));
        String z1="Tiger";
        String z2 =new String("Tiger");
        String z3="Tiger";
        System.out.println(z1.equals(z2));
        System.out.println(z2==z3);//false
        System.out.println(z1==z3);//true




    }
}
