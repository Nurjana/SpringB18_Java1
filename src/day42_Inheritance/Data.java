package day42_Inheritance;

public class Data {
    public static String publicData="public";
    protected static String protectedData="protected";
    static String defaultData="default";
    private String privateData="private";
}

class testing extends Data{// this is a separate class that is inheriting from above parent class
    public static void main(String[] args){
        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.defaultData);
        //System.out.println(testing.privateData); private ca never be inherited6921
    }

}