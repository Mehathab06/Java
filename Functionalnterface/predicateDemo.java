package Functionalnterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateDemo {
    public static void main(String[] args){
       Predicate<Integer> isEvenOdd = num->  num % 2 == 0;
//               new Predicate<Integer>() {
//            public boolean test(Integer num) {
//                return num % 2 == 0;
//            }
//        };
        System.out.println(isEvenOdd.test(10));
        System.out.println(isEvenOdd.test(17));

        Predicate<String> stringStart = str -> str.startsWith("A");

        System.out.println(stringStart.test("Anwar"));
        System.out.println(stringStart.test("Amisha"));
        System.out.println(stringStart.test("Naziya"));

        List<Integer> nums = Arrays.asList(10,13,18,17,24);
        Predicate<Integer> Even = num-> num % 2==0;
        for(Integer num : nums){
            if(Even.test(num)){
                System.out.println(num);
            }
        }

        List<String> names = Arrays.asList("John","Alex","Bob","Andrew");

        Predicate<String> PrintsName = name -> name.startsWith("A");
        for(String name : names){
            if(PrintsName.test(name)){
                System.out.println(name);
            }
        }


    }
}
