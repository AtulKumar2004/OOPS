public class OOPS16 {
    public static void main(String[] args) {
        Test t=new Test();
        t.set_marks(98); // Line 2
        System.out.println(Test.marks); // Line 3
    }
}
class Test{
    static int marks;
    void set_marks(int marks){
        this.marks=marks; // Line 1
    }
}
