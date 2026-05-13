package Constructors;

class Laptop{
    String brand ;
    int price;

    public Laptop(){
        brand = "Dell";
        price = 50000;
    }
    void display(){
        System.out.println(brand);
        System.out.println(price);
    }
}
public class DefaultValues {
    public static void main(String[] args){
        Laptop l1 = new Laptop();
        l1.display();


    }
}
