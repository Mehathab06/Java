package Composition;

public class ClassA {
    ClassB b = new ClassB();
    public int f1(int x){
        System.out.println("Inside A.f1");
        return b.f2(x);
    }
}
