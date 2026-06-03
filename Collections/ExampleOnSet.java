package Collections;

import java.util.*;

public class ExampleOnSet {
    public static void main(String[] args){
        HashSet<Long> numbers = new HashSet<>();
        numbers.add(9785525312L);
        numbers.add(9032233404L);
        numbers.add(7075036723L);
        numbers.add(8374461483L);
        numbers.add(9440567309L);
        numbers.add(9032233404L);

        for(Long num : numbers){
            System.out.println(num);
        }

        System.out.println(numbers.contains(9032233407L));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);

        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
    }
}
