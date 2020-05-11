package OfficeHours._5_6_2020;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        scrum1.fireATester(1245);

        // scrum1.testersTeam // returns the testersTeam arrayList form scrum1
        for( Tester each   : scrum1.testersTeam){//prints out every single tester from Scrum team
            System.out.println(each);
        }

        System.out.println("==========================");
        System.out.println("In my scrum team we have "+scrum1.testersTeam.size()+
                " testers and "+scrum1.devTeam.size());
    }

}
