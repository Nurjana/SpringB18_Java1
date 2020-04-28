package day11_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "Firefox";
        switch(browserName){
            case "Firefox":
                System.out.println("Firefox is opening");
                break;
            case "Chrome":
                System.out.println("Chrome is opening");
                break;
            case "Opera":
                System.out.println("Opera is opening");
                break;
            case "Safari":
                System.out.println("Safari is opening");
                break;
            default:  // otherwise
                System.out.println("Invalid Browser Name, Please give the right browser name");
                break;
        }
    }
}
