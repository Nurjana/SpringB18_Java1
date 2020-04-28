package day05_Unary_ShorthandOperators;

public class practice {
    public static void main(String[] args) {
        int a = 1;
        a = -a-- + ((a++ / -a-- )* --a);

        a = -a-- + ((a++ / -a-- )* --a);
    }
}
