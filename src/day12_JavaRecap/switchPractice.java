package day12_JavaRecap;

import java.util.Scanner;

public class switchPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        switch (3){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Invalid case");
        }
        System.out.println("======================");
//        200, OK
//        201, Created
//        202, Accepted
//        301, Moved Permanently
//        303, See Other
//        304, Not Modified
//        307, Temporary Redirect
//        400, Bad Request
//        401, Unauthorized
//        403, Forbidden
//        404, Not Found
//        410, Gone
//        500, Internal Server Error
//        503, Service Unavailable
        int statusCode =404;

        switch (statusCode){
            case (200):
                System.out.println("OK");
                break;
            case (201):
                System.out.println("Created");
                break;
                case (202):
                System.out.println("Accepted");
                break;
                case (404):
                System.out.println("Not Found");
                break;
                case (410):
                System.out.println("Gone");
                break;
                default:
                    System.out.println("Invalid entry");
        }


    }
}
