package Practice.EncapsulationApple;

public class Apple {
    private String color;
    String taste;
    char size;



    public String getColor(){
        return color;
    }

    public void setColor(String color){
        if (color.equalsIgnoreCase("rainbow")){
            System.out.println("No color called "+color);
            this.color="Invalid color!";
        }else {
        this.color=color;
    }
}}
