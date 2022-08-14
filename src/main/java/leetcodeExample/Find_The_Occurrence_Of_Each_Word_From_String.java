package leetcodeExample;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_The_Occurrence_Of_Each_Word_From_String {
    public static void main(String[] args) {
        String s = "Fear leads to anger; anger leads to hatred; hatred leads to conflict; conflict leads to suffering";

        String [] strarr = s.split(" ");

         Stream.of(strarr) .map(e -> e.replaceAll(";",""))
                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                 .entrySet().forEach(e -> System.out.println(e.getKey() + " "+e.getValue()));


    }
}
