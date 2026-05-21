package Polymorphism;

//overloaded constructor with diff. parameters

class Employee{
    int id;
    String name;
    double salary;

    Employee(){
        System.out.println("Employee details");
    }
    Employee(int id,String name){
        this.id = id;
        this.name = name;

        System.out.println(id+" "+name);
    }
    Employee(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

        System.out.println(id + " " + name + " " + salary);
    }
}
public class Example5 {
    public static void main(String[] args){
        Employee emp = new Employee();

        Employee emp1 = new Employee(101,"Mehathab");

        Employee emp2 = new Employee(102,"Anwar",68000);

    }
}
