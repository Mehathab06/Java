package Functionalnterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Examples {
    public static void main(String[] args){
        BiConsumer<String,Integer> p = (name,age)->
                System.out.println("name: "+name +" age: "+ age);
        p.accept("Mehathab",23);

        BiFunction<Integer,Integer,Integer> mul = (a,b)-> a* b;
        System.out.println(mul.apply(9,6));

        BiFunction<String,String,String> concat = (str1,str2)->
                str1+str2;
        System.out.println(concat.apply("Mehathab","Shaik"));

    }
}
