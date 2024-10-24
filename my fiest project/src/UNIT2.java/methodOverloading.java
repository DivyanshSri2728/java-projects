class Animal{
    void makeSound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.makeSound();53
    }
}
