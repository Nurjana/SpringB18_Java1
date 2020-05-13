package day36_StaticBlock;

import day34_CustomClass.Tester;

import static day36_StaticBlock.StaticBlock2.tester1;

public class StaticBlock3 {
    static String name;
    static int num;

//    public static void main(String[] args) {
////        name="Nurjana";
////        num=150000;
////        System.out.println(name);
////    }

    //ANOTHER WAY to declare above is to make it static
    static {
        name="Nurjana";
        num=150000;
        tester1=new Tester();
        tester1.setTesterInfo("Askat",456,"SDET",150000);

    }
}
