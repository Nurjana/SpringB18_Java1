package day43_MethodOverriding;

public class Circle extends Shape{
public double radius;
public static double PI=3.14; //static, because its a global value

public Circle(){}
public Circle(double radius){
this.radius=radius; }

@Override
public void calculateArea(){
    area=radius*radius*PI;
    System.out.println("Area of the circle: "+area); }

public void calculatePerimeter() {
    perimeter= radius*2*PI;
    System.out.println("Perimeter of the shape: "+perimeter);
}
}
