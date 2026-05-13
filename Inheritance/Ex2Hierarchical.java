package Inheritance;

class Mobile{
    void brand (){
        System.out.println("Brand name: ");
    }
}
class Samsung extends Mobile{
    int Cost;
    void cost(){
        System.out.println("Samsung cost: " + Cost);
    }
}
class Apple extends Mobile{
    int Cost;
    void function(){
        System.out.println("Apple function: " + Cost);
    }
}
public class Ex2Hierarchical {
    public static void main(String[] args){

        Samsung p1 = new Samsung();
        p1.Cost = 100000;
        p1.cost();
        Apple p2 = new Apple();
        p2.Cost = 200000;
        p2.function();


    }
}
