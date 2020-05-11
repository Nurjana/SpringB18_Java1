package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setCatInfo("persian","grey",2,"Murzik");
        System.out.println(cat1);// Murzin, persian, grey, 2

        Cat cat2=new Cat();
        cat2.setCatInfo("siamese","white", 1, "Sasha");

        Cat cat3=new Cat();
        cat3.setCatInfo("domestic","black", 7, "Kitty");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for(int i=0; i<=catList.size()-1;i++){
            System.out.println(catList.get(i));
        }
        System.out.println("=================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();


        System.out.println("===============");

        cat1.drink("milk");
        cat3.eat("salmon");



    }
}
