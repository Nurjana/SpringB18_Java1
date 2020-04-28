package Replit;

import com.sun.xml.internal.bind.v2.runtime.SwaRefAdapter;

import java.util.Arrays;
import java.util.Scanner;

public class email_swap_072 {
    /*
    In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,  email.indexOf("_") );
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String result = "";
        if (email.contains("_")){
            result = lastName+"_"+firstName+"@gmail.com";
            System.out.println(result);
        } else {
            System.out.println(email);
        }

//        if (email.contains("_")){
//            int i = email.indexOf("_");
//            int d = email.indexOf("@");
//            String firstName = email.substring(0, i);
//            String lastName = email.substring(i+1, d);
//            System.out.println(lastName + "_" + firstName + "@gmail.com");
//        }else{
//            System.out.println(email);
//        }
//    }
//}
    }
}

