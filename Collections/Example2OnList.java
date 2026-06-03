package Collections;

import java.util.ArrayList;

class Employee4{
    int id;
    String name;
    double salary;

    Employee4(int id, String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
     void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Example2OnList {
    public static void main(String[] args){
        ArrayList<Employee4> Employee = new ArrayList<>();
        Employee.add(new Employee4(101,"Mehathab",760000));
        Employee.add(new Employee4(102,"Anwar",890000));
        Employee.add(new Employee4(103,"Suhana",670000));
        Employee.add(new Employee4(104,"Bablu",968000));
        Employee.add(new Employee4(105,"Khadeer",85000));

        System.out.println("Employee details: ");
        for(Employee4 name : Employee){
            name.display();
        }

//  employee with highest salary
        Employee4 highest = Employee.get(0);

        for(Employee4 e : Employee){
            if(e.salary > highest.salary){
                highest = e;
            }
        }
        System.out.println("Employee with highest salary is: ");
        highest.display();

//  Remove employee by id
        int removeId = 103;
        for(int i = 0; i < Employee.size(); i++){
          if(Employee.get(i).id == removeId){
              Employee.remove(i);
              break;
          }
      }
        System.out.println("After removing an id: ");
        for(Employee4 remove : Employee){
            remove.display();
        }

    }
}
