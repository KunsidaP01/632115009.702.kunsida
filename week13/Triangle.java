package week13;

class Triangle extends CalculateShape{
    public double height=4.00;
    public double base = 12.00;
    public double result;
    public double getArea(){
        result = (base*height)/2;
        return result;
    }
}
