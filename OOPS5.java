// Inheritance
public class OOPS5 {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();
        // shark.swim();
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        
        
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
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal {
    String breed;
}

// Derived Class / subclass
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }