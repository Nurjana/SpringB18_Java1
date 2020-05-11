package day36_StaticBlock;

public class StaticBlock {
    static {
        System.out.println("Static execution");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
