package OfficeHours._5_13_20;

public class staticBlocks {
    static String str;
    // static Excel excelsheet;
    int a = 100;
    static{
        str = "Cybertek";
        str = "Harvard";
        str = "MIT";

        // a = 300;
    }



    public static void main(String[] args) {
        str = "Cybertek";
        System.out.println(str);

    }

}

class staticBlockTest{

    public static void main(String[] args) {
        System.out.println( staticBlocks.str );

    }

}
