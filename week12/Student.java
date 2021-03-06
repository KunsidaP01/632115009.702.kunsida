package week12;

public class Student {
    String name;
    int age;
    double gpa;

    public Student(){
    }
    public Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
     public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj==this.name){
            return true;  
        }
    /*Student other = (Student) obj;
        if(name!=other.name){
            return false;
        } 
        if(age!=other.age){
            return false;
        } 
        if(gpa!=other.gpa){
            return false;
        }*/
        return this.getName()==((Student) obj).getName();
    }

    public boolean equals2(Object obj){
        Student other = (Student) obj;
        if(other==null){
            return false;
        }
        if(age==other.age){
            return true;  
        }
        return this.getAge()==((Student) obj).getAge();
    }
    public boolean equals3(Object obj){
        Student other = (Student) obj;
        if(other==null){
            return false;
        }
        if(gpa==other.gpa){
            return true;  
        }
        return this.getGpa()==((Student) obj).getGpa();
    }
}
/*     
        return (this.getName()==((Student) obj).getName()&& this.getAge()==((Student) obj).getAge() 
        && this.getGpa()==((Student) obj).getGpa());*/