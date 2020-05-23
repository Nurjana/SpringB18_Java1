package Replit;

public class Value {
    private int val = 0;
    private boolean wasModified = false;
    //WRITE YOUR CODE HERE
    //a constructor accepting a single integer parameter
    public Value(int a){
        this.val=val;
    }
    //a constructor with no parameters
    public Value(){}
   // a method 'setVal' that accepts a single parameter,
    public void setVal(int b){
    }
   //a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
    public boolean wasModified(){
        return true;
    }
}


/*
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
 it getVal returns the last value passed to setVal. Otherwise if the "single int parameter"
 constructor was used to create the object, getVal returns the value passed to that  constructor.
 Otherwise getVal returns 0.
 */
