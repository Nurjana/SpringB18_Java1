package day34_CustomClass;


import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {


   Carpet [] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
   carpets[0].customOrder(7,5,20,true);
   carpets[1].customOrder(10,8,20,false);
   carpets[2].customOrder(3,5,50,true);

        ArrayList<Carpet> persianCarpet = new ArrayList<>();
        for (Carpet eachCarpet:carpets){
            if (eachCarpet.isPersian){
                persianCarpet.add(eachCarpet);
            }
        }
        System.out.println("there are "+persianCarpet+" persian carpets");
        System.out.println(persianCarpet.get(0).calcCost());
        System.out.println(persianCarpet.get(1).calcCost());

        ArrayList<Carpet> regularCarpet=new ArrayList<>(Arrays.asList(carpets));
        regularCarpet.removeAll(persianCarpet);

        System.out.println("There are "+regularCarpet+ " regular carpets");


        for (int i=0; i<regularCarpet.size();i++){
            System.out.println(regularCarpet.get(1).calcCost());
        }


    }}