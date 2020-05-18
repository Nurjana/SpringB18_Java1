package Replit.Methods;
public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private  int birthday;
    private int birthyear;
    private String ssn;
    public Person(String firstname, String lastname, int birthday, int birthmonth, int birthyear, String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthday=birthday;
        this.birthmonth=birthmonth;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getBirthday(){
        return birthday+"/"+birthmonth+"/"+birthyear;
    }
    public boolean verifySSN(String ssn){
        if (this.ssn==ssn){
            return true;
        }else {
            return false;
        }
    }
}
/*
Rename file1.java to Person.java

Create the a Person class with the following:

instance Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

Create a public method called verifySSN that takes in a String parameter and returns a boolean.  It will check the parameter against the person's SSN and return true or false based on whether they match.

Complete the questions on Classroom.
 */