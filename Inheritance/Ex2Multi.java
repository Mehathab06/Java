package Inheritance;

class GrandFather{
    void land(){
        System.out.println("Grandfather's land");
    }
}
class Father extends GrandFather{
    void house(){
        System.out.println("Father's house");
    }
}
class Son extends Father{
    void bike(){
        System.out.println("Son's bike");
    }
}
public class Ex2Multi {
    public static void main(String[] args){
        Son s1 = new Son();
        s1.land();
        s1.house();
        s1.bike();
    }
}
