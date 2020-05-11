package Replit;

public class BooleanReturnMethod {
    /*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
     */

    public static boolean isEven(int n) {
        boolean isEven;
        if (n%2==0){
            isEven=true;
        }else {
            isEven=false;
        }
        return isEven;
    }
}