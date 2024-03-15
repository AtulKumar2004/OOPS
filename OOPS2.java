// constructor
public class OOPS2 {
    public static void main(String[] args) {
        // Student s1=new Student("Atul"); // object is created for constructor named Student
        // System.out.println(s1.name);
        Student s1=new Student();
    }
}
// class Student{
//     String name; // property name
//     int roll;
//     Student(String name){
//         this.name=name;
//     }
// }
class Student{
    Student(){
        System.out.println("Constructor is called...");
    }
}