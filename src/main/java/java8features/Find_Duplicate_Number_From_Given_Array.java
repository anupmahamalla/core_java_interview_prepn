package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Duplicate_Number_From_Given_Array {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(7,8,13,9,4,8,11,15,15);
        Optional<Integer> result = returnDuplicateElements(intList);
        if(result.isPresent()) {
            System.out.println(result.get());
        }
    }

    public static Optional<Integer>  returnDuplicateElements(List<Integer> list){
       return  list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() >1)
                .map(Map.Entry::getKey).findFirst();
    }

    public static int  returnDuplicateElements1(List<Integer> intlist){
        int result=-1;
        Map<Integer, Integer> tempMap = new HashMap<>();
        for(int  num : intlist){
            if(tempMap.get(num) !=null){
                return num;
            }else{
                tempMap.put(num,1);
            }
        }
        return result;
    }
}
