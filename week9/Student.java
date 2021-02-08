package week9;
//632115009 Kunsida Phitakham
public class Student{
    private String firstname="Hello";
    private String lastname="World";
    public Student(String fname,String lname){
        this.firstname=fname;
        this.lastname=lname;
    }
    //overiding toString
    public String toString(){
      return "My first name "+firstname+" last name "+lastname;
    }
    public static void main(String[] args){
        Student p = new Student("Kunsida","Phitakham");
        System.out.println(p.toString());
    }
}
