package day23_Methods;

public class Parameter {
    public static void main(String[] args) {
        EligibleToBuyAlco(56);
    }


    public static void EligibleToBuyAlco(int age) {
        if (age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible. Go buy milk");
        }

    }
}
