package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class FormattingDecimal {
    public static void main(String[] args) {
        DecimalFormat DF= new DecimalFormat("0.00");//this shows decimal format options
        double a=10.0/3.0;
        System.out.println(DF.format(a));
    }
}
