package week12;

public class StudentData {
    
    public static void main(String[] args) {
        //Student object include name,age,gpa
        Student std01  = new Student("Mark",18,4.00);
        Student std02  = new Student("Jane",18,2.20);
        Student std03  = new Student("Peter",19,4.00);
        Student std04  = new Student("Mark",22,1.75);

        System.out.println("Compare name");
        System.out.println("Test name std01 and std02 : "+std01.equals(std02));
        System.out.println("Test name std01 and std03 : "+std01.equals(std03));
        System.out.println("Test name std02 and std04 : "+std02.equals(std04));
        System.out.println("Test name std01 and std04 : "+std01.equals(std04));
        System.out.println("");
        System.out.println("Compare age");
        System.out.println("Test age std01 and std03 : "+std01.equals2(std03));
        System.out.println("Test age std02 and std04 : "+std02.equals2(std04));
        System.out.println("Test age std01 and std04 : "+std01.equals2(std04));
        System.out.println("");
        System.out.println("Compare gpa");
        System.out.println("Test age std01 and std03 : "+std01.equals3(std03));
        System.out.println("Test age std02 and std04 : "+std02.equals3(std04));
        System.out.println("Test age std02 and std03 : "+std02.equals3(std03));
    }

}

