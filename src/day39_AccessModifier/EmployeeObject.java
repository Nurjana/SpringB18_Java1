package day39_AccessModifier;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Nurjana","SDET");
        System.out.println(employee1);

        Employee employee2=new Employee("Aylin","actress",4561, 350000  );
        System.out.println(employee2);
    }
}
