package Constructors;

class Student2{
    int id;
    String name;

    Student2(int id,String name){
        this.id = id;
        this.name = name;
        System.out.println("Parametarized Constructor");
    }
    Student2(Student2 s){
        id = s.id;
        name = s.name;

    }
    void display(){
        System.out.println(id);
        System.out.println(name);

    }
}
public class StudentObj {
    public static void main(String[] args){
        Student2 s1 = new Student2(102,"Sireesha");
        s1.display();
        System.out.println("----------------");
        Student2 s2 = new Student2(s1);
        s2.display();
    }
}
