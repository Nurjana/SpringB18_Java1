package day37_Constructors;

import day34_CustomClass.Student;

public class StudentObject {
    public static void main(String[] args) {
        Students student1= new Students("Mary Jones",17,'F',"Saint Peters University");
      //  student1.setInfo("Mary Jones",17,'F',"Saint Peters University");IF CONSTRUCTOR CREATED< WE DO
        //  NOT NEED THIS LINE< ALL CAN BE POSTED AUTOMATICALLY ABOVE

        System.out.println(student1);
        Students student2= new Students("Sha",35,'M',"Harvard");
        System.out.println(student2);
    }
}
