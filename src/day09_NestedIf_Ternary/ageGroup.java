package day09_NestedIf_Ternary;

public class ageGroup {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */
        int age = 100;
        String ageGroup = "";
        if (age < 3 && age > 0) {
            ageGroup = "Baby";
        }
        if (age < 3 && age > 0) {
            ageGroup = "Baby";
        } else if (age >= 3 && age <= 5) {
            ageGroup = "Toddler";
        } else if (age >= 6 && age <= 9) {
            ageGroup = "Kid";
        } else if (age >= 10 && age <= 12) {
            ageGroup = "pre-teen";
        } else if (age >= 13 && age <= 17) {
            ageGroup = "Teenager";
        } else if (age >= 18 && age <= 20) {
            ageGroup = "Young adult";
        } else if (age >= 21 && age <= 39) {
            ageGroup = "Adult";
        } else if (age >= 40 && age <= 54) {
            ageGroup = "Middle aged adult";
        } else if (age >=55 && age <=74){
            ageGroup ="Senior";
        } else if (age >=75&& age<=120){
            ageGroup ="Old";}
        else{
            ageGroup="Invalid entry";
        }
        System.out.println(ageGroup);
        boolean eligibleToBuy =  ageGroup == "Adult" || ageGroup == "Young Middle-Aged Adult" ||
                ageGroup == "Middle-Aged Adult";

        if(eligibleToBuy){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }

    }}