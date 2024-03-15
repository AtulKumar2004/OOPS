// implementing multiple inheritence through interface
public class OOPS13 {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.eat();
    }
}
interface Herbivorous{
    void eat();
}
interface Carnivorous{
    void eat();
}
class Bear implements Herbivorous,Carnivorous{ // inheriting the properties of both the interfaces
    public void eat(){
        System.out.println("eats grass as well as meat");
    }
}