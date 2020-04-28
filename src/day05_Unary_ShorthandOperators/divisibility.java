package day05_Unary_ShorthandOperators;

public class divisibility {
    public static void main(String[] args) {
int num =65;
boolean divBy2=num%2==0;
boolean divBy3=num%3==0;
boolean divBy5=num%5==0;

String result1= num+" is divisible by 2: "+ divBy2;
String result2 =num+ " is divisible by 3: "+divBy3;
String result3 = num+" is divisible by 5: " + divBy5;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
