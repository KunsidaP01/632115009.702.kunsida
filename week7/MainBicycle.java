package week7;
import java.util.Scanner;
public class MainBicycle {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String apply;

        TheSpeed commonBicycle = new TheSpeed(90);
        System.out.println("Enter 'spped' to speed up or 'break' to break");
        apply = in.next();
        while(!apply.equals("quit")){
            commonBicycle.apply(apply);
        }
        /*
        System.out.println("enter : ");
        apply=in.next(); 
        commonBicycle.apply(apply);
        System.out.println("enter : ");
        apply=in.next();
        commonBicycle.apply(apply);*/
        
in.close();
    }
}