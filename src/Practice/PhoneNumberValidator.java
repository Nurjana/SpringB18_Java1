package Practice;

import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);

        System.out.println("Enter phone number: ");
        String phoneNumber=scan.next();
        String areaCode="";

        if(phoneNumber.startsWith("(")){// this will eliminate ( and will print out first 3 digits as an area code
            //all KeyWords in Java are lower case
            areaCode=phoneNumber.substring(1,4);
        }else {
            areaCode=phoneNumber.substring(0,3);
        }
        System.out.println(areaCode);
        String state;

        switch (areaCode){
            case "202":
                state="Washington, DC";
                // break will break this switch case, to exit if we no longer need to run it further, once it finds this condition
                break;
        }
        switch (areaCode){
            case "201":
                state="Chicago, IL";
                break;
        default:
            state="not in the data base";
        }


}  }
