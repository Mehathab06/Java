package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Names {
    public static void main(String[] args){
      List<String> persons = Arrays.asList("Mehathab","Anwar","Amisha","Naziya","Anees");
      Optional<String> first = persons.stream()
              .findFirst();
//              .map(person -> person.toUpperCase())
//              .forEach(System.out::println);
        System.out.println(first.get());

    }
}
