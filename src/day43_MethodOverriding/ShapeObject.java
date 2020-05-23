package day43_MethodOverriding;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle1= new Circle (3);
        System.out.println(circle1.radius);
        circle1.calculateArea();///bug, no longer a bug once method in sub class overridden
        circle1.calculatePerimeter();//bug

        System.out.println("==================================");
        Rectangle rectangle =new Rectangle(3,2);
        System.out.println(rectangle.length);
        System.out.println(rectangle.width);
        rectangle.calculateArea();//bug

        rectangle.calculatePerimeter();//bug


        System.out.println("=======================================");

        Square sq1=new Square(3);
        System.out.println(sq1.side);
        sq1.calculateArea();//bug
        sq1.calculatePerimeter();//bug


        }
    }

