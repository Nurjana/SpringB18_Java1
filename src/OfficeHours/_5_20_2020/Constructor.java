package OfficeHours._5_20_2020;

class Test {


        public Test(int a){
            System.out.println("A");
        }
}


public class Constructor extends Test {
    public Constructor() {
    super(10); // A
               System.out.println("B"); }

    public static void main(String[] args) {
       Constructor obj= new Constructor();
    }
}





