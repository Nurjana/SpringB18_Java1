package day36_StaticBlock;

public class CapitalOne {
    public static void main(String[] args) {
        //if I need to change the data inside of method, like data of dev1
        HumanResources.dev1.setInfo("Nurjana","developer",150000,789456);
        System.out.println(HumanResources.dev1);
    }
}
