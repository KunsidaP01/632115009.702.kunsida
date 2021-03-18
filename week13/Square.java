package week13;
class Square extends CalculateShape{
    public double width=5.00;
    public double length = 13.00;
    public double result;
    public double getArea(){
        result = width*length;
        return result;
    }
}
