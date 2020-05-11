package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        Tester tester1 =new Tester();
        tester1.setTesterInfo("Nurjana",123,"SDET",140000 );

                ScrumTeam scrum =new ScrumTeam();
                scrum.hireTester(tester1);
                    System.out.println(scrum.testerTeam.size());

        System.out.println(scrum.testerTeam.size());
        scrum.fireTester(111);


    }
//    ScrumTeam scrum=new ScrumTeam();
//    tester1.setTes

}
