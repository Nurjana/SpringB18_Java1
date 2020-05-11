package OfficeHours._5_6_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developers> devTeam = new ArrayList<>();

    public void hireATester(Tester tester) {

        testersTeam.add(tester);
    }

    public void fireATester(long id) {
        testersTeam.removeIf(eachTester -> eachTester.employeeID == id);
    }

    public void hireDeveloper(Developers developers) {
    devTeam.add(developers);
    }


}

