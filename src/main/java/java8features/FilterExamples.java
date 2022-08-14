package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class FilterExamples {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,4,2,6,8,10);

        intList.stream().filter(a -> a % 2==0).map(b -> b*b).filter(a -> a>36).forEach(System.out::println);

        BiPredicate<Integer,Integer> biPredicate = ( a, b) -> Integer.valueOf(a)==Integer.valueOf(b);
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(20,20));
    }
}
