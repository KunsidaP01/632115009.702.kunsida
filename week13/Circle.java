package week13;
class Circle extends CalculateShape{
    public double radius=4;
    final double PI = 3.14;
    public double result;
    public double getArea(){
        result = PI*(Math.pow(4,2));
        return result;
    }
}
