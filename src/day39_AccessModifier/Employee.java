package day39_AccessModifier;

public class Employee {
    String name;
    String jobTitle;
    int id;
    double salary;

    public Employee(String name){
        this.name=name;
    }

    public Employee(String name, String jobTitle){
        this(name);// calling constructor
        this.jobTitle=jobTitle;//initializing instance to this constructor
    }

    public Employee(String name,String jobTitle,int id,double salary){
        this(name,jobTitle);
        this.id=id;
        this.salary=salary;
    }


    public String toString(){
        return "Name: "+name+", job title: "+jobTitle+", id: "+id+", salary: "+salary;
    }
}
/*
 2. create a class called Employee:
                instance variables:
                        name, jobTitle, ID, salary
                add a constructor that can initialize name of employee
                add a constructor that can initialize name, jobTitle of the employee
                            (apply constructor call to initialize the name)
                add a constructor that can initialize name, jobTitle, ID of the employee
                            (apply constructor call to initialize the name and jobTitle)
                add a constructor that can initialize name, jobTitle, ID, salary of employee
                            (apply constructor call to initialize the name, jobTitle, ID)
 */