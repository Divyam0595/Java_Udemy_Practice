package SingletonPractice;

import java.util.Date;

public class Student {
    private String rollNo;
    String name;
    int age;
    static private int counter=1;

    private String generateRollNo(){
        Date d= new Date();
        String formattedCounter= String.format("%03d",counter++);

        rollNo = "UNIV-"+((d.getYear())+1900)+"-"+formattedCounter;
        //counter++;
        return rollNo;
    }

    public Student(String name,int age){
        rollNo = generateRollNo();
        this.name= name;
        this.age= age;
    }
    public String toString(){
        return "Student Details : \nName: "+name+"\nAge :"+age+"\nRollNo :"+rollNo;
    }
}
class Test1{

    public static void main(String args[]) {
        Student s = new Student("John", 18);
        Student s1 = new Student("Thara", 15);
        Student s2 = new Student("Yathish", 20);


        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }

}
