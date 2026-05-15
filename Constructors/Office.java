package Constructors;

class Employee{
    int empId;
    String empName;
    int salary;

    public Employee(int Id, String name, int sal){
        empId = Id;
        empName = name;
        salary = sal;

    }

    void display(){
        System.out.println("Employee id: "+empId);
        System.out.println("Employee name: "+empName);
        System.out.println("Employee salary: "+salary);

    }

}
public class Office {
    public static void main(String[] args){
        Employee e1 = new Employee(101,"Mehathab",520000);
        Employee e2 = new Employee(102,"Suneel",540000);
        Employee e3 = new Employee(103,"Sireesha",520000);

        e1.display();
        e2.display();
        e3.display();


    }

}
