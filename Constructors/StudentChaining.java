package Constructors;

class Student1{
    String name;
    int id;
    int totalMarks;

    Student1(){
        this(101);
        System.out.println("No argument constructor");
    }

    Student1(int Id){
        this(Id,458);
        id = Id;
        System.out.println("One argument constructor");
    }
    Student1(int Id,int totalMark){
        this(Id,totalMark,"Mehathab");
       id = Id;
       totalMarks = totalMark;
       System.out.println("two argument constructor");

    }
    Student1(int Id,int totalMark,String StdName){
        this.id = Id;
        this.totalMarks = totalMark;
        this.name = StdName;
        System.out.println("three argument constructor");
    }
    void display(){
        System.out.println("student id: " + id +"; student marks: "+ totalMarks + "; StudentName: " + name);
    }

}
public class StudentChaining {
    public static void main(String[] args){

        Student1 s1 = new Student1();
        s1.display();

    }
}
