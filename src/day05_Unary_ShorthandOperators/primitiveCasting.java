package day05_Unary_ShorthandOperators;

public class primitiveCasting {
    public static void main(String[] args) {
        //implicit
        int a=10;
        long b=a;//implicit casting is done automatically //b=10l;
        int a1=100;
        long b1=(long)a1;//manually doing the implicit casting

        //explicit
        int Inum=100;
        byte Bnum =(byte)Inum;
        short Snum =(byte) Inum;
        double Dnum =5.5;
        float Fnum =(int) Dnum;
        System.out.println(Fnum);


    }

    }

