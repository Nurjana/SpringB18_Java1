package day41_Inheritance.Task01;

public class EmployeeObject {
    public static void main(String[] args) {
        Developer dev1=new Developer("John",150000,789456,"Developer",'m');
        dev1.coding();
        System.out.println(dev1);

        Tester tester1= new Tester("Nurjana", 130000,808080,"SDET",'f');
        tester1.testing();
        System.out.println(tester1);

        businessAnalyst ba1= new businessAnalyst("Aylin",10000,505050,"Business analyst",'f');
        ba1.writingReq();
        System.out.println(ba1);
    }
}
