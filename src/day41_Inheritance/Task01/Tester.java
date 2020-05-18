package day41_Inheritance.Task01;

import Resources.Test;

public class Tester extends Employee {
    /*
    will inherit all instances from Emplyee class
    public double salary;
   public String name;
   public long id;
   public String jobTitle;
   public char gender;

   plus we need to create additional
    reporting()
    testing()
     */
    public void reporting(){
        System.out.println(name+ " is reporting");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }

    public Tester (String name, double salary,long id, String jobTitle, char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

        }
//    create sub class of employee name it Tester:
//        variables: salary, name, id, jobTitle, gender
//        actions: reportingBug, testing
//        creata a constructor that can initialize all the attributes of Tester