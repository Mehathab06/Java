package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleOnList {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<String>();
        students.add("Mehathab");
        students.add("Sireesha");
        students.add("Amisha");
        students.add("Anees");
        students.add("Naziya");
        students.add("Mehathab");

        System.out.println("Original array: "+students);

        students.add("Sumaya");
        System.out.println("Modified array: "+students);

        students.remove(1);
        System.out.println("index removing: " + students);
        students.remove("Amisha");
        System.out.println("Object removing: " + students);

        System.out.println(students.contains("Amisha"));
        System.out.println(students.contains("Naziya"));

        students.set(1,"Anwar");//replace
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        Collections.reverse(students);
        System.out.println(students);


        //for loop
//        for(int i = 0; i <students.size(); i++){
//            System.out.println(students.get(i));

//      Enchanced for loop
//            for(String name : students){
//                System.out.println(name);

//
    }
}


