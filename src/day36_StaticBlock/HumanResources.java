package day36_StaticBlock;

import OfficeHours._5_6_2020.Developers;

public class HumanResources {
   static Developers dev1= new Developers();
   static Developers dev2= new Developers();
    static Developers dev3= new Developers();
    static Developers dev4= new Developers();
    static Developers dev5= new Developers();

    static {
        dev1.setInfo("John","Developer",150000,45687);
    }
}
