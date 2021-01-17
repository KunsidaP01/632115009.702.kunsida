package week7;

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
        Fish fish=new Fish("Nemo","clownfish","orange and white",3);
        fish.kind="fish";
        fish.showPetData();
        fish.swimSpeed=10;
        fish.size="Small";
        fish. SwimFast();
        fish.isSwimToTheSea("Swim to the sea");
    }

    
}
