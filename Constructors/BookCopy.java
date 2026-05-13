package Constructors;

class Books{
    String name;
    int price;

    Books(String name, int price){
        this.name = name;
        this.price = price;

    }
    Books(Books b){
        name = b.name;
        price = b.price;
    }

    void display(){
        System.out.println(name);
        System.out.println(price);
    }
}


public class BookCopy {
    public static void main(String[] args){
        Books b1 = new Books("Fell in love with hope",295);
        b1.display();
        System.out.println("-------------");
        Books b2 = new Books(b1);
        b2.display();
    }
}
