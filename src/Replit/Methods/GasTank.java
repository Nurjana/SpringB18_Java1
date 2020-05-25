package Replit.Methods;

public class GasTank {
    /*
    An instance variable named amount of type double, initialized to 0.
An instance variable named capacity of type double.
A constructor that accepts a parameter of type double. The value of the parameter
is used to initialize the value of capacity.
     */
    double amount=0;
    double capacity;

    public GasTank(double capacity){
        this.capacity=capacity; }

/*
A method named addGas that accepts a parameter of type double. The value of the amount instance variable
is increased by the value of the parameter. However, if the value of amount is increased beyond the value
 of capacity, amount is set to capacity.
 */
    public void addGas(double gas){
        amount=amount+gas;
        if (amount>capacity){
            amount=capacity;
    }}

    /*
    A method named useGas that accepts a parameter of type double. The value of the amount instance variable is
    decreased by the value of the parameter. However, if the value of amount is decreased below 0, amount is set to 0.
     */

    public void useGas(double gasMinus){
        amount=amount-gasMinus;
        if (amount<0){
            amount=0;
        }
    }
/*
A method named isEmpty that accepts no parameters. isEmpty returns a boolean value:
true if the value of amount is less than 0.1, and false otherwise.
 */
    public boolean isEmpty(){
        if (amount<0.1){
            return true;
        }else {
            return false;
        }
    }

   /*
   A method named isFull that accepts no parameters. isFull returns a boolean value: true if the
   value of amount is greater than capacity-0.1, and false otherwise.
    */

   public boolean isFull(){
       return  amount>0.1;
   }
   /*
   A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
    */

   public double getGasLevel(){
       return amount;
   }

   /*
   A method named fillUp that accepts no parameters. fillUp increases amount to capacity and returns the difference
   between the value of capacity and the original value of amount (that is, the amount of gas that is needed to fill the tank to capacity).
    */
   public double fillUp(){
      double leftInTank=amount;
       amount=capacity;
       return capacity-leftInTank;
   }

}
