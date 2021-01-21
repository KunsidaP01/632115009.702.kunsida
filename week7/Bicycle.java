package week7;
public class Bicycle {
    int currentSpeed;
    int increase=5;
    public Bicycle(){
    }
}
//สร้างclass extends break speed up
class NormalBicycle extends Bicycle{
    public NormalBicycle(int speed){
        currentSpeed=speed;
    }
    public void apply(String apply){

        if(apply.equals("speed")){
        this.currentSpeed+=increase;
            if(currentSpeed>99){
                currentSpeed-=increase;
                System.out.println("The current speed is too much!!");
            }    
            System.out.println("Current speed : "+currentSpeed);
        }
        else if(apply.equals("break")){
            this.currentSpeed-=increase;
            System.out.println("Current speed : "+currentSpeed);   
            }
        
    }    
}
class MountainBicycle extends Bicycle{
    int gear=2;
    public MountainBicycle(int speed){
        this.currentSpeed=speed;
    }
    public void apply(String apply){

        if(apply.equals("speed")){
        this.currentSpeed+=(increase*gear);
            if(currentSpeed>99){
                currentSpeed-=increase;
                System.out.println("The current speed is too much!!");
            }    
            System.out.println("Current speed : "+currentSpeed);
        }
        else if(apply.equals("break")){
            this.currentSpeed-=increase;
            System.out.println("Current speed : "+currentSpeed);   
            }
        
    }   
}

