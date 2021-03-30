package week4;
public class MainPerson {
    public static void main(String[] args){
        Person[] person;
        person = new Person[10];
        person[0]= new Person();
        person[0].setName("Peter Parker");
        person[0].setAge(20);
        person[0].setGender('M');
        person[0].setSalary(10000);
        person[0].setGPA(2.30);

        person[1]= new Person();
        person[1].setName("Mary Jane");
        person[1].setAge(19);
        person[1].setGender('F');
        person[1].setSalary(13000);
        person[1].setGPA(3.71);

        person[2]= new Person();
        person[2].setName("Miles Morales");
        person[2].setAge(16);
        person[2].setGender('M');
        person[2].setSalary(4000);
        person[2].setGPA(2.57);

        person[3]= new Person();
        person[3].setName("Tony Stark");
        person[3].setAge(46);
        person[3].setGender('M');
        person[3].setSalary(7000000);
        person[3].setGPA(4.00);
        
        person[4]= new Person();
        person[4].setName("Kunsida Phitakahm");
        person[4].setAge(19);
        person[4].setGender('F');
        person[4].setSalary(50000);
        person[4].setGPA(3.00);

        for(int i =0;i<5;i++){
            System.out.println("Name of person "+i+" is "+person[i].getName());
            System.out.println("Age of person "+i+" is "+person[i].getAge());
            System.out.println("Gender of person "+i+" is "+person[i].getGender());
            System.out.println("Salary of person "+i+" is "+person[i].getSalary());
            System.out.println("GPA of person "+i+" is "+person[i].getGPA());
            System.out.println("-------------------------------------");
        }
    }
}