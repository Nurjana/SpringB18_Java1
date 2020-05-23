package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {
//             sub              super
    public static void main(String[] args) {
        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
        //defaul and private classes didn't inherit from the other package
    }
}
