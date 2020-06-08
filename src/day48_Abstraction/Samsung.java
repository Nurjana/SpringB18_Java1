package day48_Abstraction;

public class Samsung extends Phone{
    static {
        brand ="Samsung";
    }

    public Samsung(String model, double price, String size){

        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("Samsung is having a call with "+phoneNumber);
    }
    @Override
    public void texting(long receiver){
        System.out.println("Samsung is texting with: "+receiver);

    }
    public void askBixby(){
        System.out.println("Samsung is asking Bixby a question ");
    }
}
