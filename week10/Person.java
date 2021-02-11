public class Person {
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
    public static void main(String[] args){
        Animal fish = new Fish();
        Person person = new Person();
        System.out.println("The calling hit(Animal)");
        person.hit(fish);
    }
}
