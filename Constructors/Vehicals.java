package Constructors;

class Car{
    String brand;
    int model;
    int price;

    public Car(String b,int m,int p){
        brand = b;
        model = m;
        price = p;
    }

    void displayDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}
public class Vehicals {
    public static void main(String[] args){
        Car c1 = new Car("Bmw",2023,1000000);
        Car c2 = new Car("Volvo",2000,500000);

        c1.displayDetails();
        c2.displayDetails();

    }
}
