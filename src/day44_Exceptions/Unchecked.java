package day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {
      // System.out.println(9/0);//unchecked exception ArithmeticException: / by zero
        // this won't print, becuase above is not compiling die to unchecked exception



        String str="Cybertek";
       // System.out.println(str.charAt(-1));  String index out of range: -1
        int []arr={1,2,3};
      //  System.out.println(arr[200]);ArrayIndexOutOfBoundsException: 200
        System.out.println("test completed");
    }
}
