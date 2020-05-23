package day42_Inheritance;

public class TestData extends Data {
    /*
    public, default, protected are inherited from Data class as it is
     */
    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
      //private won't print

    }
}
