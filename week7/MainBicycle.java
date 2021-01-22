package week7;
import java.util.Scanner;
public class MainBicycle {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String apply;

        TheSpeed commonBicycle = new TheSpeed(90);
        System.out.println("Enter 'spped' to speed up or 'break' to break ,If you want to stop enter quit");
    
       do{
           System.out.print("Please enter word: ");
               apply=input.next();
               commonBicycle.apply(apply);
       }while(!apply.equals("quit"));
        
        /*
        System.out.println("enter : ");
        apply=in.next(); 
        commonBicycle.apply(apply);
        System.out.println("enter : ");
        apply=in.next();
        commonBicycle.apply(apply);*/
        
input.close();
    }
}