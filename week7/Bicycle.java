package week7;
public class Bicycle {
    int currentSpeed;
    public Bicycle(){
    }
}
//สร้างclass extends break speed up
class TheSpeed extends Bicycle{
    public TheSpeed(int speed){
        currentSpeed=speed;
    }
    public void apply(String apply){

        if(apply.equals("speed")){
        this.currentSpeed+=5;
            if(currentSpeed>99){
                currentSpeed-=5;
                System.out.println("The current speed is too much!!");
            }    
            System.out.println("Current speed : "+currentSpeed);
        }
        else if(apply.equals("break")){
            this.currentSpeed-=5;
            System.out.println("Current speed : "+currentSpeed);   
            }
        
    }    
}

