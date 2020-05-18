package day41_Inheritance;

public class Book {
    public String title;
    public String type;
    String author;
    public double price;

    public String toString(){
        return title+ " title, "+",Author: "+author+ ", price $"+price;
    }

}
