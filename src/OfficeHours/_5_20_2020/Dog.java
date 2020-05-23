package OfficeHours._5_20_2020;

class Dog extends Pet{

    public Dog(String name, int age, String color, String size, String breed){
        setInfo(name,age,color,size,breed);
    }



    public void bark(){
        System.out.println(name+" is barking"); }
}
