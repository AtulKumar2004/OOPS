// Hierarchial Inheritance
public class OOPS6 {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.swim();
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