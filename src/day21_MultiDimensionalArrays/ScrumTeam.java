package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTEam = {"Askat", "Nurjana", "Ali", "Zeyneb"};
        String[] Testers = {"Rahman", "Bahran", "Mahran"};

        String ScrumTeam[][] = {DevTEam, Testers};
        ScrumTeam[0][3] = "Jean";
        System.out.println(ScrumTeam[0][3]);//Jean
        String info = ScrumTeam[1][2];
        System.out.println(info);//Mahran
        System.out.println("============================");

        for (String eachEmployee : ScrumTeam[0]) ;{

            //System.out.println(eachEmployee);
    }
    }
}