package day05_Unary_ShorthandOperators;

public class leapYear {
    public static void main(String[] args) {
        short year =2010;
        boolean leapYear=year%4==0;
        String result =year + " is leap year:"+ leapYear;
        System.out.println(result);
    }
}
