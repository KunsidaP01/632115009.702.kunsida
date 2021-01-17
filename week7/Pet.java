package week7;
public class Pet{

    //632115009 Kunsida Phitakham

    String name,species,color,kind;
    int age;

    public Pet(){
    }
    public void showPetData(){
        System.out.println("My "+kind);
        System.out.println("Name: "+name+" Species: "+species+" Color: "+color+" Age: "+age);
      
    }
}
class Dog extends Pet{
    String size;
    String hair;
    public Dog(String name,String species,String color,int age){
        this.name=name;
        this.species=species;
        this.color=color;
        this.age=age;
    }
    public void Run(String run){
        System.out.println("My "+kind+" is run "+run);
    } 
}
