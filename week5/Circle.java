package week5;

public class Circle {
    private double area,circumference;
    private static int count;
    
    //632115009 Kunsida Phitakam 

    public Circle(double radius){
        count++;
    }
    public void areaResult(double radius){
        if(radius<0){
            radius=0;
        }area=Math.PI*Math.pow(radius,2);
       
    }
    public void circumferenceResult(double radius){
        if(radius<0){
            radius=0;
        }
        circumference=2*Math.PI*radius;
    }
    public void displayArea(){
        System.out.println("Area of cir"+Circle.count+" = "+area);
      
    }
    public void displayCircum(){
        System.out.println("Circumference of cir"+Circle.count+"= "+circumference);
    }
    public void c1c2Intersection(double x1,double y1,double x2,double y2,double r1,double r2){
        double c1c2=(x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        double rad=(r1+r2)*(r1+r2);
        if(c1c2<=rad){
            System.out.println("Is circle 1 intersect circle 2: true");
        }
        else
            System.out.println("Is circle 1 intersect circle 3: false");
    }
    public void c1c3Intersection(double x1,double y1,double x2,double y2,double r1,double r2){
        double c1c2=(x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        double rad=(r1+r2)*(r1+r2);
        if(c1c2<=rad){
            System.out.println("Is circle 1 intersect circle 3: true");
        }
        else
            System.out.println("Is circle 1 intersect circle 3: false");
    }
}
