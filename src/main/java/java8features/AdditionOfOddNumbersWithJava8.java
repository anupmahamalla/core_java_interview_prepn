package java8features;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdditionOfOddNumbersWithJava8 {
    public static void main(String[] args) {
        List numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);



        Predicate<Integer> evenPredicate = (a) -> a % 2 ==0;

        int sum = numList.stream().filter(evenPredicate).mapToInt(a -> (int)a).sum();


       Map<String,Integer> newMap = (Map<String, Integer>) numList.stream().
               collect(Collectors.partitioningBy(a-> a%2 ==0, Collectors.summingInt(Integer::intValue)));
        System.out.printf("The Event sum is  %d",sum);

        System.out.println(newMap);


        Map<String,Integer> newMap2 = (Map<String, Integer>) numList.stream().collect(Collectors.groupingBy( a -> (int)a %2 ==0 ));

        List<Integer> evenList = (List<Integer>) numList.stream().filter(evenPredicate).collect(Collectors.toList());

        System.out.println(newMap2);

       /*for(Object intVal : newList){
           System.out.println(intVal);
       }*/
















        Map<Boolean, Integer> result = (Map<Boolean, Integer>) numList.stream().collect(
                Collectors.partitioningBy(x -> x%2 == 0, Collectors.summingInt(Integer::intValue)));

        System.out.println(result);


        //Other Simple Way
        Predicate<Integer> evenFunc = (a) -> a%2 == 0;
        Predicate<Integer> oddFunc = evenFunc.negate();

       int evenSum = numList.stream().filter(evenFunc).mapToInt((a) -> (int) a).sum();
        int oddSum = numList.stream().filter(oddFunc).mapToInt((a) -> (int) a).sum();

        Map<String, Integer> oddsAndEvenSumMap = new HashMap<>();
        oddsAndEvenSumMap.put("EVEN", evenSum);
        oddsAndEvenSumMap.put("ODD", oddSum);

        System.out.println(oddsAndEvenSumMap);
        }
}
