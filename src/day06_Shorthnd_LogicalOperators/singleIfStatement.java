package day06_Shorthnd_LogicalOperators;

public class singleIfStatement {
    public static void main(String[] args) {
        boolean coldWeather = false;
        //true
        if (coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }
    boolean coronaDetected=true;
        if (coronaDetected){
            System.out.println("Buy some water");
            System.out.println("Do more java coding");
                    }
        System.out.println("===================================");
        int a=87987;

        boolean oddNumber=a%2!=0;
        boolean evenNumber= a % 2==0;
        if (evenNumber){
            System.out.println(a+" is even number");
        }
        if (oddNumber){
            System.out.println(a+ " is odd number");
        }


    }
}
