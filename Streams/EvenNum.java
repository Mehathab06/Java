package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EvenNum {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(10, 15, 30, 34, 34,74,57,2,9,44);
//        int sum = nums.stream()

        long count = nums.stream()
            .filter(num -> num %2 == 0)
                .filter(num->num>50)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .count();
//              .forEach(System.out::println);
//                .reduce(0,(a,b)->a+b);
       System.out.println(count);

    }
}
