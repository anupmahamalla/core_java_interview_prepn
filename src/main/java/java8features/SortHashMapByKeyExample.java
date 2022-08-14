package java8features;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapByKeyExample {

    public static void main(String[] argv) {

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);


        unsortMap.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                    collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(newValue, oldValue) ->oldValue+1, HashMap::new));

        System.out.println("Original...");
        System.out.println(unsortMap);

        // sort by keys, a,b,c..., and return a new LinkedHashMap
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        // Not Recommend, but it works.
        //Alternative way to sort a Map by keys, and put it into the "result" map
        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

        System.out.println("Sorted...");
        System.out.println(result);
        System.out.println(result2);

        HashMap<Integer, String> map = new HashMap<>();


        map.put(12, "java");
        map.put(9, "sql");
        map.put(15, "python");
        map.put(30, "php");
        map.put(15, "python");
        map.put(30, "php");

        Map <Integer, String> sortedMap =  map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap( e -> e.getKey()+1,e -> e.getValue(),
                        (e1, e2) -> e1.toUpperCase()) );

        for(Map.Entry entry : sortedMap.entrySet())
                System.out.println(entry);




    }

}
