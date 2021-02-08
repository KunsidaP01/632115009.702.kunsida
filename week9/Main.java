package week9;

//632115009 Kunsida Phitakham
public class Main {
    public static void main(String[] args){
        Cube cube,rectangle;
        Rectangle shape;
        cube = new Cube();
        rectangle = new Rectangle(20,4);
        shape = new Shape();

        System.out.println(shape.toString());
        System.out.println(rectangle.toString()); 
        System.out.println(cube.toString()); 
        
    }
}
