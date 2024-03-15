// abstraction by abstract class
public class OOPS10 {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();

        System.out.println(h.color);
    }
}
        
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on two legs");
    }
}
