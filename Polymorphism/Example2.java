package Polymorphism;

//Method overloading

class Numbers{
    void multiply(int a, int b){
        System.out.println(a*b);
    }

    void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }
}
public class Example2 {
    public static void main(String[] args){
        Numbers n1 = new Numbers();
        n1.multiply(2,5);


        n1.multiply(2,1,8);

    }
}
