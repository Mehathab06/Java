package Constructors;

class Book{
    String name;
    int price;
    int pages;

    public Book(){
        System.out.println("Book created");
    }
    public Book(String Name){
        name = Name;
    }
    void display(){
        System.out.println(name);
    }
}

public class Overloading {
    public static void main(String[] args){
        System.out.println("book created");
        Book b1 = new Book("Fell in love with hope");
        b1.display();
    }
}
