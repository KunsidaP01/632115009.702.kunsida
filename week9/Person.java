package week9;

public class Person {
    String name;
    int bornYear;
public Person(String name,int bornYear){
    this.name=name;
    this.bornYear=bornYear;
}
public void introduce(){
    System.out.print("My name is "+name+",");
    System.out.println("I was born in "+bornYear+".");
}
}
class Sheriff extends Person{
    String workState;
    public Sheriff(String name,int bornYear, String workState){
        super(name,bornYear);
        this.workState=workState;
    }
//overiding
public void introduce(){
    super.introduce();
    System.out.println("I'm a sheriff and work in "+workState+".");
}
}
class Teacher extends Person {
    String university;

    public Teacher(String name, int bornYear, String university) {
        super(name, bornYear);
        this.university = university;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and teach student in " + university + ".");
    }
}
class PrimeMinister extends Person{
    String country;
    public PrimeMinister(String name,int bornYear,String country){
        super(name,bornYear);
        this.country=country;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a prime minister and work in "+country);
    }
}
class FootballPlayer extends Person{
    String workPlace;
    public FootballPlayer(String name,int bornYear,String workPlace){
        super(name,bornYear);
        this.workPlace=workPlace;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a football player and work in "+workPlace);
    }
}
class PersonalData extends Person{
    String college;
    public PersonalData(String name,int bornYear,String college){
        super(name,bornYear);
        this.college=college;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a student and I study in "+college+".");
    }
    
}