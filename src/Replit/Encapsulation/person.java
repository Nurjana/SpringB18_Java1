package Replit.Encapsulation;

import day40_Encapsulation.Person;

public class person {
    private String firstName, lastName;
    private int age;
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public person(){
        this.firstName="undefined";
        this.lastName="undefined";
        this.age=-1;
    }
    public person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public String toString(){
        return firstName+" | "+lastName+" | "+age;
    }
}