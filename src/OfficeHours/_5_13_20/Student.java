package OfficeHours._5_13_20;

public class Student {
    /*
    Student:
    ins variable:name id
    instance method toString
     */
    String name;// if it is static and later I declared two different names, the one declared latest will be printed out
    //because static only prints ones
    long id;
    static String schoolName="Cybertek";

    public String toString() {
        return "Name: " + name + ",id: " + id+", school: "+schoolName;
    }
    public static void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}

class studentObject{
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Madina";
        student1.id=123;

        Student student2=new Student();
        student2.name="Emran";
        student2.id=456;

        System.out.println(student1);
        System.out.println(student2);
    }
}

