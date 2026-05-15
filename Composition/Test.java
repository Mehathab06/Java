package Composition;

public class Test {
    public static void main(String[] args){
        ClassA a = new ClassA();
        int x = 10;
        int result = a.f1(x);
        System.out.println(result);
    }
}
