package Polymorphism;

//Method overloading

class Employee1 {
    void emp(String name, int id) {
        System.out.println(name + " " + id);
    }


    void emp(String name, int id, double salary) {
        System.out.println(name + " " + id + " " + salary);
    }
}
public class Example4 {
    public static void main(String[] args){

        Employee1 e1 = new Employee1();

        e1.emp("Mehathab",102);

        e1.emp("Anwar",101,850000);


    }
}
