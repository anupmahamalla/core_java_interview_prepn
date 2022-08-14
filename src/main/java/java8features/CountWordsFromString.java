package java8features;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class CountWordsFromString {
    public static void main(String[] args) {
        String strVal = "This this is is done by Saket Saket something is better than nothing better";

        long numberOfWords = Stream.of(strVal).map(str ->str.split(" ")).count();

        long numberOfWords2 = Stream.of(strVal).map(str ->str.split(" ")).collect(Collectors.counting());

        long numberOfWords3 = Stream.of(strVal).map(str -> Arrays.stream(str.split(" ")).count()).collect(Collectors.counting());

        System.out.println(numberOfWords2);

        System.out.println(numberOfWords);

        System.out.println(numberOfWords3);



    }
}
