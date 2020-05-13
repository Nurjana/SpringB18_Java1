package day36_StaticBlock;

public class Employee {
    String name;
    int id;
    String jobTitle;
    Double salary;
    char gender;

    public void setEmployeeInfo(String name,int id, String jobTitle,double salary,char gender){
        this.name=name;
       this.id=id;
       this.jobTitle=jobTitle;
       this.salary=salary;
       this.gender=gender;

    }
    public String toString(){
      return  "Employee name: "+name+", id:"+id+", job title: "+jobTitle+", salary: "+salary+", gender: "+gender ;
    }
}
