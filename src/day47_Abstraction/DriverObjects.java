package day47_Abstraction;

import day25_MethodsRecap.driver;

public class DriverObjects {
    public static void main(String[] args) {
        String URL="https://www.google.com";
        ChromeDriver driver=new ChromeDriver();
        driver.get(URL);// or print URL directly here

        FirefoxDriver driver2=new FirefoxDriver();
        driver2.get(URL);
        driver2.quit();

        OperaBrowser driver3=new OperaBrowser();
        driver3.get(URL);
        driver3.quit();
    }
}
