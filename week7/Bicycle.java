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
    public void applySpeed(){
        this.currentSpeed+=5;
        System.out.println("Current speed : "+currentSpeed);
    }
    public void applyBreak(){
        this.currentSpeed-=5;
        System.out.println("Current speed : "+currentSpeed);
    }
}