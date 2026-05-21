package Polymorphism;

class Human{
    void greet(String name){
        System.out.println("Hello " + name);
    }
}
class Male extends Human{
     void greet(String name){
         System.out.println("Hello Mr." + name);
     }
}
class Female extends Human{
    void greet(String name){
        System.out.println("Hello Miss." + name);
    }
}
public class Example7 {
    public static void main(String[] args){
//        Human h1 = new Human();
//         h1.greet("Sireesha");
//        Human h2 = new Male();
//         h2.greet("Sunil");
//        Human h3 = new Female();
//        h3.greet("Mehathab");

        Human h = null;
        String s = "Male";

        if(s.equals("Male")){
            h = new Male();
        }else if(s.equals("Female")){
            h = new Female();
        }
        h.greet("Anwar");
    }
}
