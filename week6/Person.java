package week6;

public class Person {
    String  name;
    String gender;
    int age;
    String job1,job2,job3,job4,job5;
  
    //632115009 Kunsida Phitakham 

    public Person(){
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
        
    }
    public void introduce(){
        System.out.println("My name is "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender :"+gender);

    }
}
class Artist extends Person{
    String genre;
    public Artist(String name, int age,String gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music.");
    }
}
class Job1 extends Person{
    String differentJob;
    public Job1(){
    }
    public void DisplayJob(){
        System.out.println("job 1 is "+differentJob);
    }
}
class Job2 extends Person{
    String differentJob;
    public Job2(){
    }
    public void DisplayJob(){
        System.out.println("job 2 is "+differentJob);
    }
}
class Job3 extends Person{
    String differentJob;
    public Job3(){
    }
    public void DisplayJob(){
        System.out.println("job 3 is "+differentJob);
    }
}
class Job4 extends Person{
    String differentJob;
    public Job4(){
    }
    public void DisplayJob(){
        System.out.println("job 4 is "+differentJob);
    }
}
class Job5 extends Person{
    String differentJob;
    public Job5(){
    }
    public void DisplayJob(){
        System.out.println("job 5 is "+differentJob);
    }
}
