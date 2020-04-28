package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
//        salary, tax rate, loan,ssn
        int salary =120000;
        double federalTAx=0.18;
        float stateTax=0.065f;
        //salary after tax= salary(1-sum of taxes)
double sumTaxes=federalTAx+stateTax;
double salaryAfterTax = salary*(1-sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("===============");

//        area of circle =r*r*pi
        double r= 5.5;
        double area = r*3.14;
        System.out.println(area);
        System.out.println("===============");

        double kg=90;
        double lb=kg*2.25;
        System.out.println(lb);

        System.out.println("============");
        double lira=1000;
        double liraInDollar =lira/6.15;
        System.out.println(liraInDollar);
        System.out.println("========");

        double liter = 10;
        double gallon =liter/3.785;
        System.out.println(gallon);
    }
}
