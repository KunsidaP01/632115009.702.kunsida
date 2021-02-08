package week9;

public class Testoverride1 {
    public static void main(String[] args){
    Person person1,person2,person3,person4,person5,person6;   
    person1= new Person("Mark",2001);
    person2= new Sheriff("Meteo",1988,"California"); 
    person3= new Teacher("Ball",1977,"CMU"); 
    person4= new PrimeMinister("Tu",1954,"Thailand");
    person5= new FootballPlayer("Messi",1987,"Bacelona football club"); 
    person6= new Student("Kunsida",2001,"CMU"); 


    person1.introduce();
    person2.introduce();
    person3.introduce();
    person4.introduce();
    person5.introduce();
    person6.introduce();
    }
  
}
