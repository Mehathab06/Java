package Constructors;

class Parent{
    int id;
    String name;

    Parent(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Child extends Parent{
    int marks;
    Child(int id, String name,int marks){
        super(id,name);
        this.marks = marks;

    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
}
public class SuperExample {
    public static void main(String[] args){
        Child c1 = new Child(101,"Bablu",470);
        c1.display();
    }
}
