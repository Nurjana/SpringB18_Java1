package day42_Inheritance.Task02;

public class DeviceObject {
    public static void main(String[] args) {
        TV tv1 =new TV("Samsung","E250",500,"SmartTV","40 inches");
        tv1.country = "USA";
        System.out.println( tv1 );
    }
}
