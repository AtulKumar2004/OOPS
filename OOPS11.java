// abstraction by abstract class
public class OOPS11 {
    public static void main(String[] args) {
        Mustang myHorse=new Mustang();
        // Animal-->Horse-->Mustang
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}