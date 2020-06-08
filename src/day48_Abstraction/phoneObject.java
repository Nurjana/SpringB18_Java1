package day48_Abstraction;

public class phoneObject {
    public static void main(String[] args) {

        iPhone device1=new iPhone("XR",799.99,"10 inches");
        iPhone device2=new iPhone("X",1000,"8 inches");
        System.out.println(device1+"\n"+device2);

        device1.faceTiming(713894);
        device1.calling(911);
        device1.texting(713-730-8888);
        System.out.println("==============================");

        Samsung device3=new Samsung("Galaxy 10", 899.99,"Note");
        device3.calling(713-550-7000);
        System.out.println(device3);
    }

    }

