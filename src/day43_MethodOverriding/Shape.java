package day43_MethodOverriding;

public class Shape {
    public double area;
    public double perimeter;

    public void calculateArea(){
        area=0;
        System.out.println("Area of the shape: "+area);
    }
    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape: "+0);
    }
}
/*
Task:
1. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */