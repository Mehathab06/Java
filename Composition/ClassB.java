package Composition;

public class ClassB {
    ClassC c = new ClassC();
    public int f2(int x){
        System.out.println("inside B.f2");
        return c.f3(x);
    }
}
