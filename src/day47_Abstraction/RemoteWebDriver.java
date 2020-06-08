package day47_Abstraction;

public abstract  class RemoteWebDriver {//to have abstarct method, the class cannot be final
   protected abstract void get(String URL);
    //method in abstract class cannot be private, as its meant to be overriden
    public abstract void quit();
}
