package week13;

public class Main {
    public static void main(String[] args){
        CalculateShape triangle = new Triangle();
        CalculateShape circle = new Circle();
        CalculateShape square = new Square();

        System.out.println("The area of Triangle is: "+triangle.getArea());
        System.out.println("The area of Circle is: "+circle.getArea());
        System.out.println("The area of Square is: "+square.getArea());
    }
}
