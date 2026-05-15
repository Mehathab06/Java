package Composition;

public class Car {
    Engine engine = new Engine();
    void drive(){
        engine.startEngine();
        System.out.println("Car stated");
    }
}
