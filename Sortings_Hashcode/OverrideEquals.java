package Sortings_Hashcode;

import java.util.HashSet;

class Person{
    int id;

    Person(int id){
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        Person p = (Person) obj;
        return this.id == p.id;

    }
    @Override
    public int hashCode(){
        return id;
    }
}
public class OverrideEquals {
    public static void main(String[] args){
        HashSet<Person> set = new HashSet<>();
//
        set.add(new Person(101));
        set.add(new Person(101));
        System.out.println(set.size());
    }
}
