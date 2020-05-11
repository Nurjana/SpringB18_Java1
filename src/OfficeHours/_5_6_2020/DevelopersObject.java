package OfficeHours._5_6_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {

     Developers developer1=new Developers();
     developer1.setInfo("Nurjana","developer",150000,80808);

    Developers developer2=new Developers();
    developer2.setInfo("Leon","Senior Developer",180000,12546);

    developer1.coding();
    developer2.fixingBug();

    Developers [] arr   ={developer1,developer2};
        System.out.println(arr[0]);    //Tester's name: Nurjana, Job title: developer, Salary: 150000.0, Employee ID: 80808
    System.out.println(arr[1].name);// will print only the name of the developer

//        for (int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);// will print all developers
//        }
        for(Developers each: arr){
            System.out.println(each);
        }
        System.out.println("================================");

        ArrayList<Developers> developer =new ArrayList<>();
        developer.addAll(Arrays.asList(developer1,developer2));





    }    }
