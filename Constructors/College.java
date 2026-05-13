package Constructors;

class Student{
    int id;
    String name;

    void Student1(){
        System.out.println(id);
        System.out.println(name);

    }
}
public class College {
    public static void main(String[] args){
        Student s1 = new Student();
       s1.id=102;
       s1.name="Anwar";
       s1.Student1();

    }
}
