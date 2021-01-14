package week5;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        //hello
        //632115009 Kunsida Phitakam
        
        Scanner input=new Scanner(System.in);
        double[] radius= new double[4];
        double[] originPoint= new double[8];
        int count=1;
        int count2=1;

        for(int i=0;i<radius.length;i++){
            System.out.print("Insert circle "+count+" radius: ");
            radius[i] = input.nextInt();
            count++;
        }
        for(int i=0;i<originPoint.length;i++){
            System.out.print("Insert circle origin point x "+count2+" : ");
            originPoint[i] = input.nextInt();
            System.out.print("Insert circle origin point y "+count2+" : ");
            originPoint[++i] = input.nextInt();
            count2++;
        }
    
        System.out.print("\n");
        Circle circle1=new Circle(radius[0]);
        circle1.areaResult(radius[0]);
        circle1.circumferenceResult(radius[0]);
        circle1.displayArea();
        circle1.displayCircum();

        Circle circle2=new Circle(radius[1]);
        circle2.areaResult(radius[1]);
        circle2.circumferenceResult(radius[1]);
        circle2.displayArea();
        circle2.displayCircum();

        Circle circle3=new Circle(radius[2]);
        circle3.areaResult(radius[2]);
        circle3.circumferenceResult(radius[2]);
        circle3.displayArea();
        circle3.displayCircum();
        
        Circle circle4=new Circle(radius[3]);
        circle4.areaResult(radius[3]);
        circle4.circumferenceResult(radius[3]);
        circle4.displayArea();
        circle4.displayCircum();

      
        circle1.c1c2Intersection(originPoint[0],originPoint[1],originPoint[2],originPoint[3],radius[0],radius[1]);
        circle1.c1c3Intersection(originPoint[0],originPoint[1],originPoint[4],originPoint[5],radius[0],radius[2]);
        System.out.print(Arrays.toString(originPoint));
        input.close();
    }
}
