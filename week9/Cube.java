package week9;

public class Cube {
    int length=10;
    public Cube(){
    }
    public String toString(){
        return "This is a cube with the side of "+length;
    }

}
class Rectangle extends Cube{
    int width;
    int height;
    public Rectangle(int width,int height){
        this.height=height;
        this.width=width;
    }
    public String toString(){
        super.toString();
        return "This is a rectangle with width as "+width+" and height as "+height;
    }
}
class Shape extends Rectangle{
    public Shape(){
        super();
    }
    public String toString(){
        super.toString();
        return "This is a shape ";
    }
}
  