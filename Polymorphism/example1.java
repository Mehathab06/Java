package Polymorphism;

// method overriding

class Shape{
    void draw(){
        System.out.println("drawing");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw a circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw a rectangle");
    }
}
public class example1 {
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();

    }
}
