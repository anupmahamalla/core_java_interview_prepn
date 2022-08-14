package java8features;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {

    //sort this map
    // client side naming server
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("anup",10);
        map.put("manish",200);
        map.put("raju",150);

        Map<String, Integer> sorted = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).collect(
                        Collectors.toMap(k -> k.getKey(), v -> v.getValue(),
                                (newVal,oldVal) -> newVal, HashMap::new));

        Map<String, Integer> sorted1 = map.entrySet().stream().
                sorted(Map.Entry.comparingByKey()).collect(
                Collectors.toMap(k -> k.getKey(), v -> v.getValue(),
                        (newVal,oldVal) -> newVal, LinkedHashMap::new));

        for(Map.Entry entry: sorted.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }

        System.out.println("\n");

        for(Map.Entry entry: sorted1.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }



        map.put("anup",10);
        map.put("manish",200);
        map.put("raju",150);





    }
}
