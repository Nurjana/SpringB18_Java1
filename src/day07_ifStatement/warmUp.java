package day07_ifStatement;

public class warmUp {
/*
Warmup task:
	1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares
	three integers as angles and check whether a triangle is valid or not.
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
	5. write a java program that can identify if a person is eligible to vote for Donald Trump
	Note : use single if statements
 */
public static void main(String[] args) {
    double a = 60;
    double b= 60;
    double c = 60;
    double angles=a+b+c;
    if (angles==180){
        System.out.println("The sum is 180 degrees, the triangles is valid");
    }
    if (angles!=180){
        System.out.println("Triangle is invalid");
    }
    /*
    write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
     */
    int num1=12;
    int num2=23;
    int num3=34;
    if(num1>num2&& num1>num3){
        System.out.println("The larges number is "+num1);
    }
    if(num2>num1&& num2>num3){
        System.out.println("The larges number is "+num2);
    }
    if(num3>num2&& num3>num1){
        System.out.println("The larges number is "+num3);
    }



}
}
