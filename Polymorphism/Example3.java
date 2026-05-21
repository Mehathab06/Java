package Polymorphism;

//method overriding

class Vehicle{
    void speed(){
        System.out.println("Gives the max limit of Vehicles");
    }
}
class Bike extends Vehicle{
    void speed(){
        System.out.println("bike Max limit is 60");
    }
}
class Car extends Vehicle{
    void speed(){
        System.out.println("car Max limit is 120");
    }
}
public class Example3 {
    public static void main(String[] args){
        Vehicle v1 = new Bike();
        v1.speed();

        Vehicle v2 = new Car();
        v2.speed();
    }
}
