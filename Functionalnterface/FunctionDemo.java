package Functionalnterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args){
        Function<Integer,Integer> square = l -> l * l;
        System.out.println(square.apply(9));
//length of the string
        Function<String,Integer> length = str -> str.length();
        System.out.println(length.apply("I am shaik mehathab"));


// length of each name
        List<String> names = Arrays.asList("Ram","Ravi","John");
        Function<String,Integer> length1 = name -> name.length();
        for(String name : names){
            System.out.println(length1.apply(name));
        }
    }
}
