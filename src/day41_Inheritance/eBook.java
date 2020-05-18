package day41_Inheritance;

public class eBook extends Book {
    String size;
    int pages;
  /*
    title (inherited)
    author (inherited)
    price (inherited)
    toString() (inherited)
    size (declared)
    pages (declared)
    readbook()
     */

    public void readBook(){
        System.out.println("reading "+title);
    }

    public static void main(String[] args) {

    }
}
