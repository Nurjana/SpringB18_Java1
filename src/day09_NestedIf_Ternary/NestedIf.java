package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        boolean UScitizen=false;
        int age =17;
        if(UScitizen){
            if (age>17){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }else{
            System.out.println("Only US citizens can vote");
        }
        System.out.println("=================================");
        int score =98;
        String grade ="";
        if (score>=0 && score<=100){
            grade =(score >=90)? "A": (score >=80)? "B" : (score >=70)?"C": (score >=60)?"D": "F";
        }
        System.out.println(score+ " is "+ grade);
    }
}
