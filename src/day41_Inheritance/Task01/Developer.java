package day41_Inheritance.Task01;

public class Developer extends Employee{


    public Developer (String name, double salary,long id, String jobTitle, char gender) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
}


/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
 */