package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 =true;
        System.out.println(!result1);//false
        boolean result2=!(10+15>15); //false
        System.out.println(result2);

    boolean result3=!true==!false;
        System.out.println(result3);
        boolean R1 ="Corona virus"!="End of the world"&& "Toilet paper"=="Cure";
                        //true            false             false  ==> false
        boolean R2 = 10>15 && 15<13;
//                   false     false
        System.out.println(R1);
        System.out.println(R2);

        boolean R3 ='a'=='b'-1 &&'b'+1=='c';
        System.out.println(R3);

    }
}
