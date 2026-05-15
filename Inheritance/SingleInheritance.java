package Inheritance;

class Animal{

    void eat(){
        System.out.println("Every animal eats food ");
    }
}
class Dog extends Animal{

    void bark(){
        System.out.println("Dog barks");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

    }
}
