package Constructors;

class Product{
    int id;
    String name;

    Product(){
        this(101);
        System.out.println("No argument Constructor:");
    }
    Product(int id){
        this(id,"Anwar");
        System.out.println("One argument constructor:");
    }
    Product(int id,String name){
        this.id = id;
        this.name = name;
        System.out.println("two argument constructor:");
    }

    void displayList(){
        System.out.println(id);
        System.out.println(name);

    }
}
public class ProductChaining {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.displayList();
    }
}
