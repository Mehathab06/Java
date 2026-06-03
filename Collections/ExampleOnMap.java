package Collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleOnMap {
    public static void main(String[] args){
        Map<Integer,Integer> student = new HashMap<>();
        student.put(101,89);
        student.put(102,92);
        student.put(103,79);
        student.put(104,86);

        System.out.println(student.entrySet());
        System.out.println(student.get(103));
        System.out.println(student.remove(101));
        student.put(103,83);
        System.out.println("After update: "+student.entrySet());

    }
}
