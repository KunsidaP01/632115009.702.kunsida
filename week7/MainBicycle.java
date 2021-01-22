package week7;
import java.util.Scanner;
public class MainBicycle {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        
        String apply;

        NormalBicycle commonBicycle = new NormalBicycle(10);
        MountainBicycle mountainBicycle = new MountainBicycle(10);

        System.out.println("\n");
        System.out.println("Please choose type of bicycle, Bicycle or Mountain");
        String type=input.next();

        if(type.equals("Bicycle")){
            System.out.println("Enter 'speed' to speed up or 'break' to break ,If you want to stop enter quit");
            System.out.println("Now ,the current speed is "+commonBicycle.currentSpeed);
       do{
           System.out.print("Please enter: ");
               apply=input.next();
               commonBicycle.apply(apply);
       }while(!apply.equals("quit"));
        }
        else if(type.equals("Mountain")){
            System.out.println("Enter 'speed' to speed up or 'break' to break ,If you want to stop enter quit");
            System.out.println("Now ,the current speed is "+commonBicycle.currentSpeed);
       do{
           System.out.print("Please enter: ");
               apply=input.next();
               mountainBicycle.apply(apply);
       }while(!apply.equals("quit"));
        }   
input.close();
    }
}
