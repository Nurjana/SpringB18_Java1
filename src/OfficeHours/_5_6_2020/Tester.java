package OfficeHours._5_6_2020;

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTItle,double salary, long employeeID){
        this.name=name;
        this.jobTitle=jobTItle;
        this.salary=salary;
        this.employeeID=employeeID;
    }
    public String toString(){
        return "Tester's name: "+name+", Job title: "+jobTitle+
                ", Salary: "+salary+", Employee ID: "+employeeID;
    }
    public void smokeTesting(){
        System.out.println(this.name+" is doing smoke test");
    }
    public void creatingTicket(){
        System.out.println(this.name+" creating a ticket");
    }
}
