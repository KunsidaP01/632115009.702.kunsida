package week4;

public class TestCircle {
    public static void main(String[] args){
        Circle myCircle = new Circle(0.5);
        System.out.println("The area of the circle of radius "
        +myCircle.getRadius()+" is "+myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius()*1.1);
        System.out.println("The area of the circle of radius "
        +myCircle.getRadius()+" is "+myCircle.getArea());
        System.out.println(myCircle.getRadius());
        System.out.println(myCircle.getNumberOfObjects());
      

        System.out.println("The number of object is "+myCircle.getNumberOfObjects());
        myCircle.setNumberOfObjects(10);
        System.out.println("The number of object is "+myCircle.getNumberOfObjects());
        System.out.println(myCircle.color);
    }
  
}