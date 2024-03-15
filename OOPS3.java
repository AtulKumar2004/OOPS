// constructor overloading
public class OOPS3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Atul");
        Student s3=new Student(123);
    }
}
class Student{
    String name;
    int roll;
    Student(){ // non parameterized constructor
        System.out.println("constructor is called...");
    }
    Student(String name){ // parameterized constructor
        this.name=name;
    }
    Student(int roll){ // parameterized constructor
        this.roll=roll;
    }
}
