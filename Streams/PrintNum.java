package Streams;

import java.util.Arrays;
import java.util.List;

public class PrintNum {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        nums.stream()
                .forEach(System.out::println);
    }
}
