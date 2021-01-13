package week6;

//632115009 Kunsida  Phitakham

public class InheritanceExample {
    public static void main(String[] args){
        Artist art = new Artist("Ball", 20,"Male");
        art.genre="hip hop";
        art.introduce();
        art.playMusic();
        
        Job1 job1=new Job1();
        job1.differentJob="Doctor";
        job1.DisplayJob();
        
        Job2 job2=new Job2();
        job2.differentJob="Engineer";
        job2.DisplayJob();
        
        Job3 job3=new Job3();
        job3.differentJob="Programmer";
        job3.DisplayJob();

        Job4 job4=new Job4();
        job4.differentJob="Singer";
        job4.DisplayJob();

        Job5 job5=new Job5();
        job5.differentJob="Police";
        job5.DisplayJob();
    }
}
