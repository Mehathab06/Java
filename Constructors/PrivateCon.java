package Constructors;

class Student3{
    int id;
    String name;

    private Student3(int id,String name){
        this.id = id;
        this.name = name;

    }

    void display(){
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args){
            Student3 s1 = new Student3(104,"Anwar");
            s1.display();
    }
}
public class PrivateCon {
//    public static void main(String[] args){
//        Student3 s2 = new Student3(104,"Anwar");
//        s2.display();
//    }

}
