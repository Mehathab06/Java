package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return id + " " + name + " " + salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(101,"Anwar",45000),
                new Employee(102,"Ram",55000),
                new Employee(103,"Ravi",65000),
                new Employee(104,"John",50000),
                new Employee(105,"Rajesh",56000));
//        to print employees whose salary is greater than 50000
        employees.stream()
                .filter(emp->emp.salary>50000)
                .forEach(System.out::println);

//        to print employee names only
        employees.stream()
                .map(emp->emp.name)
               .forEach(System.out::println);

//        employee with highest salary
        Employee highest = employees.stream()
                .max((e1,e2)->Double.compare(e1.salary,e2.salary))
                .get();
        System.out.println(highest);


//      count employees whose salary is greater than 50000
        long count = employees.stream()
                .filter(emp->emp.salary>50000)
                .count();
        System.out.println(count);


        //    update existing objects salary
        employees.stream()
                .map(emp -> emp.salary += 2500);
        employees.forEach(System.out::println);

//  Descending order
        employees.stream()
                .sorted(Comparator.comparing(
                        (Employee emp)->emp.salary)
                        .reversed()
                )
                .forEach(System.out::println);
    }
}
