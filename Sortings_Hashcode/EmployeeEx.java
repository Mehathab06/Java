package Sortings_Hashcode;

import java.util.HashSet;

class Employee1{
    int id;
    String name;

    Employee1(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        Employee1 e = (Employee1) obj;
        return this.id == e.id;
//        return this.name = e.name;
    }
    @Override
    public int hashCode(){
        return id;
    }

}
public class EmployeeEx {
    public static void main(String[] args){
        HashSet<Employee1> emp = new HashSet<>();
//        emp.add(101);
//        emp.add(102);
        emp.add(new Employee1(101,"Mehathab"));
        emp.add(new Employee1(102,"Anwar"));
        emp.add(new Employee1(101,"sweety"));

        System.out.println(emp.size());

    }
}
