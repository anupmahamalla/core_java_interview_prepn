package collection.map.concurrenthashmap;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {


    public static void main(String[] args) {

        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 7);
        map.put(8, 8);
        map.put(9, 9);
        map.put(10, 10);
        map.put(11, 11);
        map.put(12, 12);

        System.out.println("Map: \n" + map);

        System.out.println("\nMap displayed via forEach():");
        map.forEach(2, (k, v) -> System.out.println("key: " + k + ", Value: " + v));

        System.out.println("\nMap displayed via forEach() after incrementing each value with 1:");
        map.forEach(2, (k, v) -> v = v + 1, v -> System.out.println("Value: " + v));

        System.out.println("\nMap displayed via forEachEntry():");
        map.forEachEntry(2, (e) -> System.out.println("key: " + e.getKey() + ", Value: " + e.getValue()));

        System.out.println("\nCheck if key=value via forEachEntry():");
        map.forEachEntry(2, (e) -> Objects.equals(e.getKey(), e.getValue()), System.out::println);

        System.out.println("\nDisplay keys via forEachKey():");
        map.forEachKey(2, System.out::println);

        System.out.println("\nKeys displayed via forEachKey() after incrementing each key with 1:");
        map.forEachKey(2, (k) -> k = k + 1, System.out::println);

        System.out.println("\nDisplay values via forEachValue():");
        map.forEachValue(2, System.out::println);

        System.out.println("\nKeys displayed via forEachValue() after incrementing each value with 1:");
        map.forEachValue(2, (v) -> v = v + 1, System.out::println);
    }
}