package Functionalnterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args){
        Supplier<String> str = () -> "Hello Mehathab";
            System.out.println(str.get());
        Supplier<Integer> num = () -> 100;
            System.out.println(num.get());

        Supplier<Double> number = () -> Math.random();
        System.out.println(number.get());
    }


}
