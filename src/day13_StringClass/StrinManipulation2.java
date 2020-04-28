package day13_StringClass;

public class StrinManipulation2 {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";
//            012345678
        String schoolName = str.substring(0,19);
        System.out.println(schoolName);
        String fullName = "Askat Baiganchuk";
//                 0123456789..
        String firstName = fullName.substring(0, 5 );
        String lastName = fullName.substring(6,15+1);
        System.out.println(firstName);
        System.out.println(lastName);
// full name = firstname lastname
        String Askat = "Askat Baiganchuk";
        String firstname = Askat.substring(0,5);
        String lastname = Askat.substring(6,16);
        System.out.println(firstname);
        System.out.println(lastName);
//String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
        String gmail = lastname + "_" + firstname + "@gmail.com";
        System.out.println(gmail);
        String s1 = "I love Java Programming Language";
//           01234567...
        String className = s1.substring(7);
        System.out.println(className);

        String s2 ="I like C# Programming";
      s2= s2.replace("c2",  "Java");

        System.out.println(s2);

        String name ="Covid 18";
        name= name.replace("18", "19");
        System.out.println(name);

        String r1="I like C#,C# if fun, C# is cool";
        r1=r1.replaceFirst("C#", "Java");
        System.out.println(r1);

        String r2 ="Tomorrow is Tuesday";
        r2=r2.replace("Tomorrow","Today");
        System.out.println(r2);


    }
}
