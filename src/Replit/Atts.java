package Replit;

public class Atts {
    String name;
    String color;
    int amount;

    public void asString(String objectName, String objectColor, int objectAmount) {
        name = objectName;
        color = objectColor;
        amount = objectAmount;

    }

    public String asString() {
        return "name: " + name + " color: " + color + " amount: " + amount;

    }
}