// use of static keyword
public class OOPS14 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Atul";
        s1.schoolName="JMV";

        Student s2=new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.name);    
        
        Student s3=new Student();
        s3.schoolName="ABC"; // it will make the schoolName="ABC" for all the three objects
    }
}
class Student{
    String name;
    int roll;
    static int returnPercentage(int math,int phy,int chem){ // For Student class,this function returnPercentage will be created only for one time in memory
        return (math + phy + chem) /3;
    }
    static String schoolName; // In Student class,this variable schoolName will be created only for one time in memory
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}