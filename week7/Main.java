package week7;

//632115009 Kunsida Phitakham
public class Main {
    public static void main(String[] args){
        Dog dog=new Dog("Lucky","Pooddle","brown",2);
        dog.kind="dog";
        dog.size="Small";
        dog.showPetData();
        dog.Run("to the jungle");
        dog.Bark("Box Box!!");
        dog.isShortHair("Short hair");

        System.out.println("\n");
        Fish fish=new Fish("Nemo","Clownfish","orange and white",3);
        fish.kind="fish";
        fish.showPetData();
        fish.swimSpeed=10;
        fish.size="Small";
        fish. SwimFast();
        fish.isSwimToTheSea("Swim to the sea");
    
        System.out.println("\n");
        Bird bird=new Bird("Elizabeth","Parrot","green",19);
        bird.kind="bird";
        bird.country=" Australia";
        bird.canFly="yes";
        bird.showPetData();
        bird.Speak("yes");
        bird.isCanFly();
        bird.CheckCountrry();
        
        
    }
}
