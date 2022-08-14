package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SortingStringArraywithLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "BB", "ACD", "ABCD" );

        //out put should be BB  ABC  ACD  ABCD

        // Comparator<String> strlenComp = (a, b) -> Integer.compare(a.length(), b.length());

        Comparator<String> strlenComp = (a, b) -> {
            if(a.length() < b.length()) return -1;
            else if (a.length() > b.length()) return 1;
            else return 0;
        };

        list.stream().sorted(strlenComp).collect(Collectors.toList()).forEach(System.out::println);
        // BiFunction biFunction = (s1, s2) -> s1.toString().length() - s2.toString().length();



        //list.stream().sorted((e1,e2) -> e1.compareTo(e2)).collect(Collectors.toList());


        int[] arr = {1, 2, -3, 4, 5, 6, -7, 8, 9, 10};
        List<Integer> ls = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10);
        System.out.println(ls.stream().map(x-> {
            if(x < 0 || x % 2 == 0){
                return x;
            }else if(x %2==1){
                return x*2;
            }else if(x < 0){
                return 0;
            }
            return null;
        }).collect(Collectors.summingInt(Integer::intValue)));


    }
}