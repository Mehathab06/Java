package Functionalnterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> names = name -> System.out.println("Welcome " + name);
        names.accept("Mehathab");
        names.accept("Anwar");

        List<String> fruits = Arrays.asList("Apple","Mango","Orange");
        Consumer<String> fruitNames = fruit ->  System.out.println(fruit);
            for(String fruit : fruits){
               fruitNames.accept(fruit);
            }

        Consumer<String> s = str -> System.out.println(str.toUpperCase());
            s.accept("java");
            s.accept("spring");
            s.accept("microservices");

        List<String> persons = Arrays.asList("ram","ravi","john");

        Consumer<String> s1 = str1 -> System.out.println(str1.toUpperCase());
        for(String str1 : persons){
            s1.accept(str1);
        }
    }
}