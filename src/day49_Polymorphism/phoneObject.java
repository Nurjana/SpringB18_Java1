package day49_Polymorphism;

public class phoneObject {
    public static void main(String[] args) {

    iPhone phone1=new iPhone("X", 999.99, "8 inches");
        System.out.println(phone1);
    phone1.calling(7138949566l);
    phone1.texting(7137308888l);
    phone1.faceTiming(7135507000l);
    phone1.download();
}
}
