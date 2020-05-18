package Replit.Methods;

public class pizza {
    /*
    Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
     */
    // this are private instances
    private String size;
    private int numCheese;
    private int numPepperoni;
    private int numHam;


    /*
    Constructor(s) that set all of the instance variables.
     */
    //this is a constructor, name has to match the class name
    public pizza(String size,int numCheese, int numPepperoni,int numHam) {
        this.size = size;
        this.numCheese = numCheese;
        this.numPepperoni = numPepperoni;
        this.numHam = numHam;
    }
//    public String getSize() {
//        return size;
//    }
//    public int getNumberOfCheese(){
//        return numCheese;
//    }
//    public int getNumberOfPepperoni(){
//        return numPepperoni;
//    }
//    public int getNumberOfHam(){
//        return numHam;
//    }
    //Public methods to get and set the instance variables.
    // this is a method that sets instances
    public void setPizza(String size, int numCheese, int numPepperoni, int numHam) {
        this.size = size;
        this.numCheese = numCheese;
        this.numPepperoni = numPepperoni;
        this.numHam = numHam;
    }


    /*
    A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
     */

    public double calcCost() {
        double price = 0;
        if (size.equalsIgnoreCase("small")) {
            price = 10 + 2 * (numCheese + numPepperoni + numHam);
        } else if (size.equalsIgnoreCase("medium")) {
            price = 12 + 2 * (numCheese + numPepperoni + numHam);
        } else {
            price = 14 + 2 * (numCheese + numPepperoni + numHam);
        }
        return price;
    }
    //method that returns String to print out objects
    public String getDescription() {
        return size+ " pizza with " + numCheese +" Cheese toppings, " + numPepperoni +" Pepperoni toppings, and "
                + numHam+" Ham toppings."+"\nTotal price: "+calcCost();
    }




}

/*
 large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
    Total Price: 18.0


 */