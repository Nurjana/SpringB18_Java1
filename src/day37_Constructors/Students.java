package day37_Constructors;

public class Students {
    //name, age, gender,and university
    // these are instance methods
    String name;
    int age;
    char gender;
    String university;

    public Students(String name, int age, char gender,String university){//CONSTRUCTOR
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }

    public void setInfo(String name, int age, char gender,String university){
                this.name=name;
                this.age=age;
                this.gender=gender;
                this.university=university;
            }

            public String toString(){
                return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
            }
    }




