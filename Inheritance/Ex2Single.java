package Inheritance;

class Vehicle{
    void start(){
        System.out.println("vehicle is started");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("driver finding the way");
    }
}
public class Ex2Single {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.start();
        c1.drive();

    }
}
