// Hybrid Inheritance
public class OOPS7 {
    public static void main(String[] args) {
        Peacock pc=new Peacock();
        pc.eat();
        pc.breathe();
        pc.fly();
        pc.color="Bluish Green";
        System.out.println(pc.color);
    }
}
// Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// Derived Class / subclass
class Mammal extends Animal{
    int legs;
}
// Derived Class / subclass
class Fish extends Animal {
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
// Derived Class / subclass
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Tuna extends Fish{
    void speed(){
        System.out.println("can swim at a speed more than 40 miles per hour");
    }
}
class Shark extends Fish{
    void bones(){
        System.out.println("has no bones");
    }
}
class Peacock extends Bird{
    String color;
}
class Dog extends Mammal{
    void sound(){
        System.out.println("barks");
    }
}
class Cat extends Mammal{
    void jump(){
        System.out.println("jump up to six times their height");
    }
}